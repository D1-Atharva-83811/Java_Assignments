import java.util.Scanner;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	
	public SalariedEmployee() {
		this(0);
	}
	public SalariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary=weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("Enter weekly salary: ");
		weeklySalary = sc.nextDouble();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Salary: "+weeklySalary);
	}
}
