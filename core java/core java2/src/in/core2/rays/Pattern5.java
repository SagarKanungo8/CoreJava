package in.core2.rays;

public class Pattern5 {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int s = 5; s > row; s--) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
			}
		// TODO Auto-generated method stub

	}
}
