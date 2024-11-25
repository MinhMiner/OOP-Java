public class CheckingAccount extends Account {
    public CheckingAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /** Withdraw an amount. */
    public void withdraw(double amount) {
        try {
            double initialBalance = balance;
            doWithdrawing(amount);
            addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_CHECKING,
                amount, initialBalance, balance));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /** Deposit an amount. */
    public void deposit(double amount) {
        try {
            double initialBalance = balance;
            doDepositing(amount);
            addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_CHECKING,
                amount, initialBalance, balance));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
