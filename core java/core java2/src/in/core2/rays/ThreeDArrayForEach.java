package in.core2.rays;

public class ThreeDArrayForEach {

	public static void main(String[] args) {
		int[][][][] t4= new int [3][5][5][5];
		for (int [][][] t3:t4) {
			for (int [][]t2:t3) {
				for (int[] t1:t2) {
					for (int element :t1) {
					System.out.print(element+" ");
				}
				System.out.println();
				}		
			System.out.println();
		}
			System.out.println();
		}
			System.out.println();
		// TODO Auto-generated method stub
	}
}
