package in.core2.rays;

public class SumOfEven {

	public static void main(String[] args) {
		int number=30, i, evenSum = 0;
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
		}
		System.out.println("30 " + 30 + "  =  " + evenSum);
	}		
		// TODO Auto-generated method stub
		}
