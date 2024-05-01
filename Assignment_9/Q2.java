import java.util.Scanner;

public class Q2 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter String: ");
//		String str1 = sc.next();
//		StringBuffer s1 = new StringBuffer(str1);
//		s1.reverse();
//		String str2=s1.toString();
//		
//		if(str1.equals(str2)) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not a Palindrome");
//		}
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str1 = sc.next();
		int i=0;
		while(i<str1.length()) {
			if(str1.charAt(i)==str1.charAt(str1.length()-1-i)) {	
				i++;
			}
			else {
				System.out.println("Not a palindrome");
				break;
			}
		}
		if(i==str1.length()) {
			System.out.println("Palindrome");
		}
	}

}
