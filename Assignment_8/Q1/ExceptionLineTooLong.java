public class ExceptionLineTooLong extends RuntimeException {
	public ExceptionLineTooLong() {
		// TODO Auto-generated constructor stub
		System.out.println("The String is too long...");
	}
	public ExceptionLineTooLong(String message) {
		System.out.println(message);
	}
}
