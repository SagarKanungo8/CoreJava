package in.com.raysConditionalStatment;

public class IncomeTaxCalculate {
	public static void main(String[] args) {
		int income = 300000;
		if(income<500000) {
			System.out.println("No Tax Deducted");
		}else if(income<1000000) {
		System.out.println("20% Tax Deducted");
	}else if(income>1000000){
		System.out.println("30% Tax Deducted");
	}else
		System.out.println("No Tax");
}
}