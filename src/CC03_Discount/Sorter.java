package CC03_Discount;

public class Sorter {
    public void sortInvoice(InvoicePosition[] invoice) {
        for (int j = 0; j < invoice.length - 1; j++) {
            for (int i = 0; i < invoice.length - j - 1; i++) {
                if (invoice[i].getAmount() > invoice[i + 1].getAmount()) {
                    InvoicePosition temp = invoice[i];
                    invoice[i] = invoice[i + 1];
                    invoice[i + 1] = temp;
                }
            }
        }
    }
}
