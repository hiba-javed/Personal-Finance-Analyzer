public class Transaction {
    private String date;
    private String description;
    private double amount;
    private String category;

    public Transaction(String date, String description, double amount, String category) {
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    public Transaction() {
        this.date = "0000-00-00";
        this.description = "Default Transaction";
        this.amount = 0.0;
        this.category = "Uncategorized";
    }

    @Override
    public String toString() {
        return date + " | " + description + " | $" + amount + " | " + category;
    }
}
