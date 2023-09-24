package in.com.raysLoops;

public class ForLoop {
	
	public static void main(String[] args) {
		
		// for(initialisation;condition;updation){
		//do something
		// }
		//for(int i=1;i<=5;i++) {
		//	System.out.println(i);
		//}
		
		// Print Square Pattern======
		
		//for(int i=1;i<=4;i++) {
			//System.out.println("****");
		//}
		
		
     //Print Reverse of Number======
		
		//int n = 345678;
		//while(n>0) {
			//int lastDigit = n%10;
		 //System.out.print(lastDigit);;
	     //n = n/10;
		
		//}
		//System.out.println();
		
		// Reverse the number=====
		
		int n = 10899;
		int rev = 0;
		while(n>0) {
		 	int lastDigit = n%10;
			rev = (rev*10)+lastDigit;
			n = n/10;
		}
			System.out.println(rev);
			
			
			
			
			
			
			
			
			
			
		
	}
}

