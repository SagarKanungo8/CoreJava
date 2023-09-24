package in.core2.rays;

public class SumOfDivisableBy7 {

	public static void main(String[] args) {
		int sum=0;
		for (int i=100;i<=200;i++) {
		int remainder=i%7;
		if(remainder==0) {
			sum=sum+i;
		}
		}
		System.out.println("sum of no div by 7 is "+sum);
	}
		// TODO Auto-generated method stub
	}
