package in.core2.rays;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 29;
	    boolean flag = false;
	    for (int i = 2; i <= 29 / 2; ++i) {
	      if (29 % i == 0) {
	        flag = true;
	        break;
	      }
	    }
	    if (!flag)
	      System.out.println(29 + " is a prime number.");
	    else
	      System.out.println(29 + " is not a prime number.");
		// TODO Auto-generated method stub

	}

}
