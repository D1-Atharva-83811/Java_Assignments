import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		float totalMiles;
		float costPerGallon;
		float mileage;
		float parkingFees;
		float tolls;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total Miles driven: ");
		totalMiles=sc.nextInt();
		System.out.print("Enter cost per gallon: ");
		costPerGallon=sc.nextInt();
		System.out.print("Enter average miles per gallon: ");
		mileage=sc.nextInt();
		System.out.print("Enter parking fees: ");
		parkingFees=sc.nextInt();
		System.out.print("Enter tolls per day: ");
		tolls=sc.nextInt();
		
		float costPerDay=((totalMiles/mileage)*costPerGallon)+parkingFees+tolls;
		System.out.println("The total Cost of driving car per day is: "+costPerDay);
	}

}
