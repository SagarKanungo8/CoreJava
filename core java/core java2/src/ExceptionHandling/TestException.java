package ExceptionHandling;

public class TestException {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		System.out.println("Main Method Start");
		try {
			int c = a/b;
			System.out.println(c);
		} catch (ArithmeticException d) {
			System.out.println(d);
		}
		System.out.println("Main Method End");
	}

}
