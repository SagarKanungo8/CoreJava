package in.com.raysLoops;

import java.util.Scanner;

public class WhileLoop {
 
      // while(condition){
	// do something this loop run till the condition become false.
      // }
	public static void main(String[] args) {
		
	
	//int counter = 0;
	//while(counter<10) {
		//System.out.println("Hello World");
		//counter++;
	//}
     //System.out.println("Printed Hello World 100x");
		
		// Print number from 1 to 10 -----
		
		//int counter = 1;
		//while(counter<=10) {
		//System.out.println(counter);
			//System.out.print(counter+" ");
		//counter++;
		//}
		//System.out.println();
		
		//Scanner sc  = new Scanner(System.in);
		//int range = sc.nextInt();
		//int counter = 1;
		//while(counter<=range) {
			//System.out.print(counter + " ");
			//counter++;
		//}
		///System.out.println();
		
		//print sum of first n natural numbers-----
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=n) {
			sum = sum+i;
			i++;
		}
         System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}