import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	
	public Employee() {
	this("","");	
	}
	public Employee(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void display() {
		System.out.println(firstName+" "+lastName);
	}
	public void accept(Scanner sc) {
		System.out.println("Enter First name: ");
		firstName = sc.next();
		System.out.println("Enter Last name: ");
		lastName = sc.next();
	}
}
