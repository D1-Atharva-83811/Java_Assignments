import java.util.Scanner;

public class HourlyEmployee extends Employee{
	private double wage;
	private int hrs;
	
	public HourlyEmployee() {
		this(0, 0);
	}
	public HourlyEmployee(double wage, int hrs) {
		super();
		this.hrs=hrs;
		this.wage=wage;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("Enter hourly wage: ");
		wage = sc.nextDouble();
		System.out.println("Enter hours worked: ");
		hrs = sc.nextInt();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		if(hrs<=40) {			
			System.out.println("Salary: "+(wage*hrs));
		}
		else {
			int x = hrs-40;
			System.out.println("Salary: "+((wage*40)+(wage*1.5*x)));
		}
	}
}
