import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		System.out.println("Menu: ");
		System.out.println("---------------------");
		System.out.println("01. Idli-10Rs");
		System.out.println("02. Samosa-20Rs");
		System.out.println("03. Dosa-30Rs");
		System.out.println("04. MaduWada-40Rs");
		System.out.println("05. WadaPav-50Rs");
		System.out.println("06. Khichadi-60Rs");
		System.out.println("07. Pizza-70Rs");
		System.out.println("08. Pasta-80Rs");
		System.out.println("09. Burger-90Rs");
		System.out.println("10. Generate Bill");
		int choice=0;
		int total=0;
		Scanner sc = new Scanner(System.in);
		while(choice!=10) {
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				total+=10;
				break;
			case 2:
				total+=20;
				break;
			case 3:
				total+=30;
				break;
			case 4:
				total+=40;
				break;
			case 5:
				total+=50;
				break;
			case 6:
				total+=60;
				break;
			case 7:
				total+=70;
				break;
			case 8:
				total+=80;
				break;
			case 9:
				total+=90;
				break;
			case 10:
				System.out.println("Total Bill is: "+total+". Thank you for coming!");
				break;
			default:
				System.out.println("Invalid Choice!!");
				
			}
		}
	}

}
