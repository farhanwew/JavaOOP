package id.its.pbo;

public class InvoiceProgram {
	public static void main(String[] args) {
	    Invoice invoice1 = new Invoice("101", "Macbook", 2, 1200000);
        Invoice invoice2 = new Invoice("102", "Asus", 3, 15000000);
		System.out.println("Invoice amount 1:"+invoice1.getInvoiceAmount());
		System.out.println("invoice amount 2" + invoice2.getInvoiceAmount());
	}
}
