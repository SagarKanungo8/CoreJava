package in.core2.rays;

public class Fibonacci {

	public static void main(String[] args) {
		 int n = 20, firstTerm = 0, secondTerm = 1;
		    System.out.println("Fibonacci Series till"+ n+"terms:");
		    for (int i= 1; i<= n; i++) {
		    System.out.print(firstTerm + ",");
            int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		    }
		  }
		// TODO Auto-generated method stub

	}
