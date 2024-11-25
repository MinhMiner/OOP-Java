import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    /** Deposit money. */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }

        balance += amount;
        transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
    }

    /** Withdraw money. */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }
        
        if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }

        balance -= amount;
        transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
    }

    /** Add a new transaction. */
    public void addTransaction(double amount, String operation) {
        if (operation != Transaction.DEPOSIT && operation != Transaction.WITHDRAW) {
            System.out.println("Yeu cau khong hop le!");
            return;
        }

        if (operation == Transaction.DEPOSIT) {
            deposit(amount);
        } else {
            withdraw(amount);
        }
    }

    /** Print transactions history. */
    public void printTransaction() {
        int i = 1;
        for (Transaction t : transitionList) {
            System.out.print("Giao dich " + i + ": ");

            if (t.getOperation() == Transaction.DEPOSIT) {
                System.out.print("Nap tien ");
            } else {
                System.out.print("Rut tien ");
            }

            System.out.printf("$%.2f. So du luc nay: $%.2f.%n",
                t.getAmount(),
                t.getBalance()
            );
            i++;
        }
    }
}