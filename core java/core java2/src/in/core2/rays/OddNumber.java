package in.core2.rays;

public class OddNumber {

	public static void main(String[] args) {
				int count=0;
				for(int i=2;i<=67;i++) {
					int remainder=i%2;
					if(remainder!=0){
						count=count+1;
					}
				}System.out.println("count of odd no "+count);
			}
			}
		// TODO Auto-generated method stub

