package CC03_Discount;

public class InvoicePosition {
    private String article;
    private double amount;

    public InvoicePosition(String article, double amount) {
        this.article = article;
        this.amount = amount;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return this.article + "," + this.amount;
    }
}
