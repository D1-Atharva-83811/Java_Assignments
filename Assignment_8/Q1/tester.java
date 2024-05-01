import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s;
		try {
			System.out.println("Enter string: ");
			s=sc.next();
			if(s.length()>80) {
				throw new ExceptionLineTooLong();
			}
		}catch(ExceptionLineTooLong e) {
			
		}
	}
}
