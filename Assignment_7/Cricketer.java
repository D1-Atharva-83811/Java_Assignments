import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler{

	private int runs;
	private int wickets;
	
	public Cricketer() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Cricketer(int id, int age, String name, int matchesPlayed, int runs, int wickets) {
		super(id,age,name,matchesPlayed);
		this.runs=runs;
		this.wickets=wickets;
	}
	
	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("Enter runs: ");
		runs=sc.nextInt();
		System.out.println("Enter wickets: ");
		wickets=sc.nextInt();
	}
	
	@Override
	public int getWickets() {
		// TODO Auto-generated method stub
		
		return wickets;
	}

	@Override
	public int getRuns() {
		// TODO Auto-generated method stub
		return runs;
	}
	
}