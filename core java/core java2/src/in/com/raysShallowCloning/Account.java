package in.com.raysShallowCloning;

public class Account implements Cloneable{
	 int balance;
	 
	 public Account() {
	
}
	 public Account (int balance) {
		 this.balance = balance;
	 }
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	 
	 
	 
	 
}