import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		Player []p=new Player[11];
		Scanner sc = new Scanner(System.in);
		
		int choice;
		int count =0;
		
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add a player");
			System.out.println("2. Display total runs of all players");
			System.out.println("3. Display total wickets of all players");
			System.out.println("4. Display total matches played");
			System.out.println("5. Display players");
			choice=sc.nextInt();
			
			switch(choice) {

			case 0:
				System.out.println("thank you...");
				break;

			case 1:
				if(count<11) {					
					p[count]=new Cricketer();
					p[count].accept(sc);
					count++;
				}
				else {
					System.out.println("Array full...");
				}
				break;
				
			case 2:
				int r=0;
				for(int i=0;i<count;i++) {
					Cricketer c=(Cricketer)p[i];
					r+=c.getRuns();
				}
				System.out.println("Total runs= "+r);
				break;
				
			case 3:
				int w=0;
				for(int i=0;i<count;i++) {
					Cricketer c=(Cricketer)p[i];
					w+=c.getWickets();
				}
				System.out.println("Total wickets= "+w);
				break;
				
			case 4:
				int m=0;
				for(int i=0;i<count;i++) {
					Cricketer c = (Cricketer)p[i];
					m+=c.getMatchesPlayed();
				}
				System.out.println("Total matches= "+m);
				break;

			case 5:
				for(int i=0;i<count;i++) {
					System.out.println("Matches of "+p[i].getName()+" = "+p[i].getMatchesPlayed());
					System.out.println("---------------------------------------");
				}
				break;
								
			default:
				System.out.println("Invalid input!!");
				break;
			}
		}while(choice!=0);

	}

}
