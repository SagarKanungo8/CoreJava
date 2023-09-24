package in.com.raysShallowCloning;

public class TestAccount {
	public static void main(String[] args) throws CloneNotSupportedException {
		Account a = new Account(100);
		//System.out.println(a.balance);
		Account a1 = (Account) a.clone();
		a1.balance = 800;
		System.out.println(a.balance);
		System.out.println(a1.balance);
	}
}
	