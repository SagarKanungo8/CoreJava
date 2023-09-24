package in.core2.rays;

public class EvenOdd1080 {

	public static void main(String[] args) {
		int sum=0;
		int count=0;
		int avg=0;
		for(int i=10; i<=80;i++) {
			sum=sum+i;
			count=count+1;
			avg=sum/count;
		}
		System.out.println("average of odd and even no is "+avg);
	}
		// TODO Auto-generated method stub
	}
