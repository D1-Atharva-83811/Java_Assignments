package Q2;

public class Circle {
	Point2D p;
	double diameter;
	
	public Circle() {
		// TODO Auto-generated constructor stub
		this.p=new Point2D(0,0);
		this.diameter=100;
	}
	public Circle(double x, double y, double diameter) {
		this.p=new Point2D(x,y);
		if(diameter<0) {
			throw new DiameterException();
		}
		else {
			this.diameter=diameter;
		}
	}
	public void setDiameter(double diameter) {
		if(diameter>0) {
			this.diameter = diameter;			
		}
		else {
			throw new DiameterException();
		}
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(diameter);
	}
	
}
