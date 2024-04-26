import java.util.Scanner;

public class TestPointArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,coordinate,a, b;
		double distance;
		
		System.out.println("Enter number of Co-ordinate you want to Enter : ");
		n = sc.nextInt();
	
		
		Point2D[] points = new Point2D[n];
		
		for(int i = 0; i< n; i++)
		{
			System.out.println("Enter Point "+(i+1));
			points[i] = new Point2D();
			points[i].accept();			
		}
		
		
		
		int choice=0;
		while(choice != 4)
		{
			System.out.println("1) Display Specific Point");
			System.out.println("2) Display All Points");
			System.out.println("3) Calculate Ditsance");
			System.out.println("4) Exit");
			System.out.println("Enter YOur Chocie : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter Co-ordinate you want to see : ");
				coordinate = sc.nextInt();
				System.out.println(points[coordinate].getDeatils());
				break;
				
			case 2:
				System.out.println("All Points:");
				for(Point2D point : points)
					{
					System.out.println(point.getDeatils());
					}
				break;
				
			case 3 :
				System.out.println("Enter Point 1 to Calculate Distance : ");
				a = sc.nextInt();
				System.out.println("Enter Point 2 to Calculate Distance : ");
				b = sc.nextInt();
				
				if(points[a].isEqual(points[b]))
				{
					System.out.println("Co-ordinates are same ...");
				}else
				{
					distance = Math.sqrt( Math.pow((points[b].getY() - points[a].getY()),2) +  Math.pow((points[b].getY() - points[a].getY()),2));
					System.out.println("Cordinate is at Distance  : "+ distance);
				}
				break;

			case 4: System.out.println("Exiting......");
			break;
			default:
				System.out.println("Invalid Choice ...");
				break;
			}
			
		}
		
	}

}
