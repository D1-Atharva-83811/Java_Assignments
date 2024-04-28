package tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {
	Fruit[] basket;
	int count;
	
	FruitBasket(int size){
		basket = new Fruit[size];
		count =0;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		
		System.out.println("Enter basket size: ");
		size=sc.nextInt();
		FruitBasket fb=new FruitBasket(size);
		fb.menu();
	}
		public void menu() {
			Scanner sc = new Scanner(System.in);
			int choice;
			do{
				System.out.println("0. Exit");
				System.out.println("1. Add Mango");
				System.out.println("2. Add Orange");
				System.out.println("3. Add Apple");
				System.out.println("4. Display all fruits");
				System.out.println("5. Display details of all fruits");
				System.out.println("6. Mark a fruit as stale");
				System.out.println("7. Display Taste of all stale fruits");
				System.out.println("8. Mark all sour fruits as stale");
				System.out.println("Enter your choice: ");
				choice=sc.nextInt();
				switch(choice) {
				case 0:
					System.out.println("Exiting....");
					break;
				
				case 1:
					if(count<basket.length) {
						basket[count]=new Mango("Yellow",0.6,"Hapus");
						System.out.println("Mango added succesfully!");
						count++;
					}
					else {
						System.out.println("Basket is Full!");
					}
					break;
					
				case 2:
					if(count<basket.length) {
						basket[count]=new Orange("Orange",0.6,"Santri");
						System.out.println("Orange added succesfully!");
						count++;
					}
					else {
						System.out.println("Basket is Full!");
					}
					break;
					
				case 3:
					if(count<basket.length) {
						basket[count]=new Apple("Red",0.6,"Kashmiri");
						System.out.println("Apple added succesfully!");
						count++;
					}
					else {
						System.out.println("Basket is Full!");
					}
					break;
					
				case 4:
					System.out.println("Names of all fruits in Basket:");
					for(int i=0;i<count;i++) {
						System.out.println((i+1)+": "+basket[i].getName());
					}
					break;
					
				case 5:
					System.out.println("Details:");
					for(int i=0;i<count;i++)
					{
						if(basket[i].isFresh()) {
							System.out.println((i+1)+": "+basket[i].getName()+","+basket[i].getColor()+","+basket[i].getWeight()+","+basket[i].taste()+", "+basket[i].isFresh());
						}
					}
					break;
					
				case 6:
					System.out.println("Enter index:");
					int index = sc.nextInt();
					if(index>=0 && index<count) {
						basket[index].setFresh(false);
						System.out.println("Fruit at index "+index+" is now stale.");
					}
					else {
						System.out.println("Incorrect Index entered!");
					}
					break;
					
				case 7:
					for(int i=0;i<count;i++) {
						if(basket[i].isFresh()==false) {
							System.out.println("Taste of stale fruits is: "+basket[i].taste());
						}
					}
					break;
					
				case 8:
					for(int i=0;i<count;i++) {
						if(basket[i].taste()=="Sour") {
							basket[i].setFresh(false);
						}
					}
					System.out.println("All sour fruits are now stale.");
					break;
					
				default:
					System.out.println("Invalid choice!");
					break;
				}
			}while(choice!=0);
		}
	}
