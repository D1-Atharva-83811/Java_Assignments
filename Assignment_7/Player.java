import java.util.Scanner;

public abstract class Player {
	private int id;
	private int age;
	private String name;
	private int matchesPlayed;
	
	public Player(){
		this(0,0,"",0);
	}
	public Player(int id, int age, String name, int matchesPlayed) {
		this.id=id;
		this.age = age;
		this.name = name;
		this.matchesPlayed=matchesPlayed;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter Id: ");
		id=sc.nextInt();
		System.out.println("Enter Name: ");
		name=sc.next();
		System.out.println("Enter age: ");
		age=sc.nextInt();
		System.out.println("Enter matches played: ");
		matchesPlayed=sc.nextInt();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
