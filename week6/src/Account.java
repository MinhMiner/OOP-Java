import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    public Account() {
        
    }

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /** Withdraw an amount of money. */
    public void doWithdrawing(double amount) 
    throws InvalidFundingAmountException, InsufficientFundsException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }

        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        }

        balance -= amount;
    }

    /** Deposit an amount of money. */
    public void doDepositing(double amount) throws InvalidFundingAmountException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }

        balance += amount;
    }

    public abstract void withdraw(double amount);
    
    public abstract void deposit(double amount);

    /** Get transaction history. */
    public String getTransactionHistory() {
        StringBuilder result = new StringBuilder();
        result.append("Lịch sử giao dịch của tài khoản " + accountNumber + ":");
        for (Transaction t : transactionList) {
            result.append("\n" + t.getTransactionSummary());
        }
        return result.toString();
    }

    /** Add a transaction to transactionList. */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /** Check if two accounts are the same. */
    public boolean equals(Object obj) {
        if (!(obj instanceof Account)) {
            return false;
        } else {
            Account temp = (Account) obj;
            return (this.accountNumber == temp.accountNumber);
        }
    }
}
