package Core.rays.exception;

public class TestLogin {
public static void main(String[] args) {
	}
int v=10000;
if (v==5000) {
	InsuficientBalance i = new InsuficientBalance();
	try {
		throw i;
	} catch (InsuficientBalance o) {
		System.out.println("Error:" + o.getMessage());
	}else {
		System.out.println("you can withdraw account");
	}
}







