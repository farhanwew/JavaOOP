package id.its.pbo;

public class Invoice {
	
	//  variabel instance
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	// constructor
	public Invoice(String partNumber, String partDescription, int quantity, double price){
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}
	
	// setter partnumber
	public String getPartNumber() {
		return partNumber;
	}
	
	// getter partnumber
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	// getter partdescription
	public String getPartDescription() {
		return partDescription;
	}
	
	// setter partdescription
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	// getter quantity
	public int getQuantity() {
		if (this.quantity >0){
			return this.quantity;
		}
		else{
			return 0;
		}
	}
	
	// setter quantity
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// getter price
	public double  getPrice() {
		if (this.price > 0){
			return price;
		}
		return 0;
	}
	
	// setter price
	public void setPrice(double price) {
		this.price = price;
	}

	// get invoice amount = quantity * price
	public double getInvoiceAmount(){
		return (double) this.getQuantity() * this.getPrice();
	}
}
