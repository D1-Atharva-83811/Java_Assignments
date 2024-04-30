import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Scanner sc = new Scanner(System.in);
		int choice;
		int size;
		int count =0;
		System.out.println("enter number of employees: ");
		size = sc.nextInt();
		Employee []e=new Employee[size];
		do {
			
			System.out.println("0. Exit");
			System.out.println("1. Salaried Employee");
			System.out.println("2. Hourly Employee");
			System.out.println("3. Commission Employee");
			System.out.println("4. Base Salaried Employee");
			System.out.println("5. Display All Employees");
			System.out.println();
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				if(count==size) {
					System.out.println("Array full....");
				}
				else {
					e[count] = new SalariedEmployee();
					e[count].accept(sc);
					count++;					
				}
				break;
				
			case 2:
				if(count==size) {
					System.out.println("Array full....");
				}
				else {					
					e[count] = new HourlyEmployee();
					e[count].accept(sc);
					count++;
				}
				break;
				
			case 3:
				if(count==size) {
					System.out.println("Array full....");
				}
				else {
					e[count] = new CommissionEmployee();
					e[count].accept(sc);
					count++;
				}
				break;
				
			case 4:
				if(count==size) {
					System.out.println("Array full....");
				}
				else {
					e[count] = new BaseSalary();
					e[count].accept(sc);
					count++;
				}
				break;
				
			case 5:
				if(count==0) {
					System.out.println("Empty array....");
				}
				else {					
					for(int i=0; i<count;i++) {
						e[i].display();
					}
				}
			}
		}while(choice!=0);
		System.out.println("Thank you....");
	}

}
