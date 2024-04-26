package InvoicePackage;
//import java.lang.*;

public class Invoice {
	private String partNumber;
	private String partDesc;
	private int quantity;
	private double price;
	
	Invoice(){
		this("","",0,0);
	}
	Invoice(String partNumber,String partDesc, int quantity, double price){
		if(price<0) {
			setPrice(0);
		}else {
			this.price=price;
		}
		if(quantity<0) {
			setQuantity(0);
		}else {
			this.quantity=quantity;	
		}
		this.partNumber=partNumber;
		this.partDesc=partDesc;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public String getPartDesc() {
		return partDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
