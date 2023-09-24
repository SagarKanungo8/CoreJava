package in.com.raysQExc;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,60,16};
		int a = 0;
		int b= 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>a) {
				a=b;
				b=arr[i];
			}
			if (arr[i]<b && arr[i]>a) {
				
				a=arr[i];
				
			}
			
			
			
		}
System.out.println(a);
	}

}
