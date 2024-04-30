import java.util.Scanner;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee() {
		this(0,0);	
	}
	public CommissionEmployee(double grossSales, double commissionRate) {
		super();
		this.commissionRate=commissionRate;
		this.grossSales=grossSales;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("Enter gross sales: ");
		grossSales = sc.nextDouble();
		System.out.println("Enter commission rate: ");
		commissionRate = sc.nextDouble();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Salary: "+(grossSales*(commissionRate/100)));
	}
}
