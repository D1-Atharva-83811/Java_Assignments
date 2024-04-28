package com.app.fruits;

public class Fruit {
	String color;
	double weight;
	String name;
	boolean isFresh;
	
	public Fruit(){
	this("",0,"");
	}
	public Fruit(String color, double weight, String name) {
		this.color=color;
		this.weight=weight;
		this.name=name;
		this.isFresh=true;
	}
	public String toString(String color, double weight, String name, boolean isFresh) {
		return "Color is "+color+", wieght is "+weight+"Kg, Name is "+name+", and it is fresh: "+isFresh;
	}
	public String taste() {
		return "No specific Taste";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
}
