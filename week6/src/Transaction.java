public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 0;
    public static final int TYPE_WITHDRAW_CHECKING = 1;
    public static final int TYPE_DEPOSIT_SAVINGS = 2;
    public static final int TYPE_WITHDRAW_SAVINGS = 3;
    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    /**
     * Constructor with 4 parameters.
     * @param type Transaction type.
     * @param amount The transferred amount.
     * @param initialBalance Initial balance.
     * @param finalBalance Balance after transaction.
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    private String getTransactionTypeString(int type) {
        switch (type) {
            case 0:
                return "Nạp tiền vãng lai";
            case 1:
                return "Rút tiền vãng lai";
            case 2:
                return "Nạp tiền tiết kiệm";
            case 3:
                return "Rút tiền tiết kiệm";
            default:
                return "";
        }
    }

    /** Return the summary of this transaction. */
    public String getTransactionSummary() {
        String temp1 = "- Kiểu giao dịch: " + getTransactionTypeString(type) + ". ";
        String temp2 = String.format("Số dư ban đầu: $%.2f. ", initialBalance);
        String temp3 = String.format("Số tiền: $%.2f. ", amount);
        String temp4 = String.format("Số dư cuối: $%.2f.", finalBalance);

        return temp1 + temp2 + temp3 + temp4;
    }
}
