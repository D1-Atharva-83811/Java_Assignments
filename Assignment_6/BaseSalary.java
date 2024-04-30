import java.util.Scanner;

public class BaseSalary extends CommissionEmployee{
	private double baseSalary;
	
	public BaseSalary() {
		this(0);
	}
	public BaseSalary(double baseSalary) {
		super(0,0);
		this.baseSalary=baseSalary;
	}
	
	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("Enter base salary: ");
		baseSalary = sc.nextDouble();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Base Salary: "+baseSalary);
	}
}
