package ExceptionHandling;

public class TestBatch {
	public static void main(String[] args) {
		
		String name = "Sagar";
		System.out.println(name.length());
		try {
			System.out.println(name.charAt(8));
		} catch (Exception e) {
			System.out.println(e);
		}
	
		
	}

}
