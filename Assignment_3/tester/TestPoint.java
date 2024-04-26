package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("For Point 1:");
		System.out.println("Enter X co-ordinate: ");
		x=sc.nextInt();
		System.out.println("Enter Y co-ordinate: ");
		y=sc.nextInt();
		Point2D p1=new Point2D(x,y);
		System.out.println("For Point 2:");
		System.out.println("Enter X co-ordinate: ");
		x=sc.nextInt();
		System.out.println("Enter Y co-ordinate: ");
		y=sc.nextInt();
		Point2D p2=new Point2D(x,y);
		
		p1.getDetails();
		p2.getDetails();
		if(p1.isEqual(p2)) {
			System.out.println("Points are the same!");
		}else {
			p1.calculateDistance(p2);
		}
	}
}
