public class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /** Withdraw an amount. */
    public void withdraw(double amount) {
        if (amount <= 1000 && balance - amount >= 5000) {
            try {
                double initialBalance = balance;
                doWithdrawing(amount);
                addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
                    amount, initialBalance, balance));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    /** Deposit an amount. */
    public void deposit(double amount) {
        try {
            double initialBalance = balance;
            doDepositing(amount);
            addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
                amount, initialBalance, balance));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
