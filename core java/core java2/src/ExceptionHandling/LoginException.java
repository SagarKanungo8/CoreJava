package ExceptionHandling;

public class LoginException extends RuntimeException {

	public LoginException() {
			super("Invalid user");
		}
	}


