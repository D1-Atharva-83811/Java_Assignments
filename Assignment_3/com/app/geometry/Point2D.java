package com.app.geometry;

public class Point2D {
	int x;
	int y;
	
	public Point2D(int x, int y){
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String getDetails() {
		return "The co-ordinates are: "+x+", "+y;
	}
	public boolean isEqual(Point2D p) {
		if(x==p.getX() && y==p.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	public void calculateDistance(Point2D p) {
		double dist = Math.sqrt(((p.getX()-x)*(p.getX()-x))+((p.getY()-y)*(p.getY()-y)));
		System.out.println("The distance is: "+dist);
	}
	
}
