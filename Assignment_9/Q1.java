import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		StringBuffer s1 = new StringBuffer(s);
		s1.reverse();
		System.out.println(s1);
	}
}
