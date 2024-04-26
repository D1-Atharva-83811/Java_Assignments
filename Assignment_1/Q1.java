import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1,num2;
		System.out.println("Enter first value: ");
		if(sc.hasNextDouble()) {
			num1=sc.nextDouble();
			System.out.println("Enter next value: ");
			if(sc.hasNextDouble()) {
				num2=sc.nextDouble();
				System.out.println("Average of two numbers is="+((num1+num2)/2));
			}
			else {
				System.out.println("This is not Double value!");
			}
		}
		else {
			System.out.println("This is not Double value!");
		}
	}

}
