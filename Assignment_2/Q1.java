import java.util.Scanner;

class Customer{
	int accountNo;
	int pendingBal;
	int totalPurchase;
	int totalCredit;
	int allowedCredit;
	
	Customer(){
		
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total Items charged: ");
		this.totalPurchase=sc.nextInt();
		System.out.print("Enter total credit applied: ");
		this.totalCredit=sc.nextInt();
		System.out.print("Enter pending balance: ");
		this.pendingBal=sc.nextInt();
		System.out.print("Enter allowed credit: ");
		this.allowedCredit=sc.nextInt();
	}
	
	public void display() {
		System.out.println("Total Items charged: "+totalPurchase);
		System.out.println("Total Items charged: "+totalCredit);
		System.out.println("Total Items charged: "+pendingBal);
		if((totalPurchase+pendingBal-totalCredit)<allowedCredit) {
			System.out.println("Pending Credit: "+(totalPurchase+pendingBal-totalCredit));
		}
		else {
			System.out.println("Credit Limit Exceeded!");
		}
	}
}

public class Q1 {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.accept();
		c1.display();
	}

}
