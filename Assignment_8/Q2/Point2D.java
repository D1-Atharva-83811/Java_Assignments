package Q2;

import java.util.Scanner;

public class Point2D {
	double x;
	double y;
	
	public Point2D() {
		// TODO Auto-generated constructor stub
	}
	public Point2D(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	private void accept(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter x coordinate: ");
		x=sc.nextInt();
		System.out.println("Enter y coordinate: ");
		y=sc.nextInt();
	}
	private void display() {
		// TODO Auto-generated method stub
		System.out.println("Coordinates are: x="+x+" y="+y);
	}
}
