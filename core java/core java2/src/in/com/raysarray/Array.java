package in.com.raysarray;

public class Array {

	public static void main(String[] args) {
		
		int[] table;
		table = new int[10];
		table[0] = 2;
		table[1] = 4;
		table[2] = 6;
		table[3] = 8;
		table[4] = 10;
		table[5] = 12;
		table[6] = 14;
		table[7] = 16;
		table[8] = 18;
		table[9] = 20;
		
		int ele = table[4];
		System.out.println("5th Element" + ele);
		
		int size = table.length;
		System.out.println("Size is " + size);
	}
}
