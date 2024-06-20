package CC03_Discount;

public class Main {

    public static void main(String[] args) {
        InvoicePosition[] invoice = new InvoicePosition[10];

        createExampleInvoice(invoice);

        Sorter sorter = new Sorter();
        sorter.sortInvoice(invoice);

        for(int i = 0; i < invoice.length; i++)
        {
            if (invoice[i] != null)
                System.out.println(invoice[i].toString());
        }
    }

    private static void createExampleInvoice(InvoicePosition[] invoice)
    {
        invoice[0] = new InvoicePosition("Apple", 1.30);
        invoice[1] = new InvoicePosition("Yoghurt", 0.79);
        invoice[2] = new InvoicePosition("Olive oil", 10.99);
        invoice[3] = new InvoicePosition("Vinegar", 2.39);
        invoice[4] = new InvoicePosition("Bread", 4.99);
        invoice[5] = new InvoicePosition("Bubblegum", 1.49);
        invoice[6] = new InvoicePosition("Beans", 0.69);
        invoice[7] = new InvoicePosition("Fish", 14.99);
        invoice[8] = new InvoicePosition("Bananas", 2.00);
        invoice[9] = new InvoicePosition("Pumpkin", 1.79);
    }
}
