package Q2;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		try {
			c.display();
			c.setDiameter(10);
			c.display();
			c.setDiameter(-10);
		}catch(DiameterException e){
			c.display();
			c.setDiameter(10000);
			c.display();
		}
	}

}
