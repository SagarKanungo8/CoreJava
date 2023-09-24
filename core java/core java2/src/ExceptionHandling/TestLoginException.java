package ExceptionHandling;

public class TestLoginException {
	public static void main(String[] args) {
		String name = "Sagar";
		if(name.equals("Sagar")) {
			System.out.println("valid User");
		}else {
			LoginException e = new LoginException();
			try {
				throw e;
			} catch (Exception e2) {
          System.out.println(e);	
			}
		}
	}

}
