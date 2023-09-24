package in.com.raysQExc;

public class ReverseNo {

	public static void main(String[] args) {
	
		int a= 87654321;
		int b= 0;
		int c;
		
		while(a!=0) {
			c=a%10;
			
			System.out.println(c);
			b=b*10+c;
			a=a/10;
			
		}
		
		
	
	}
	
	
	}
