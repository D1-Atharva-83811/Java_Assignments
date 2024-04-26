package InvoicePackage;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Invoice i = new Invoice();
		double total=0;
		int choice=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter part number: ");
		i.setPartNumber(sc.next());
		System.out.println("Enter part description: ");
		i.setPartDesc(sc.next());
		System.out.println("Enter price: ");
		i.setPrice(sc.nextDouble());
		System.out.println("Enter quantity: ");
		i.setQuantity(sc.nextInt());
		total=i.getPrice()*i.getQuantity();
		System.out.println("Total Bill is: "+total+"Rs.");
	}
}
