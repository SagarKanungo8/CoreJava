package in.core2.rays;

public class Nested {

	public static void main(String[] args) {
		int pre = 80, mains = 85, interview = 50, criteria = 75;
		if (pre >= criteria) {
		if (mains >= criteria) {
			if (interview >= criteria) {
				System.out.println("you are selected");
			} else {
				System.out.println("your interview score" + interview + "is below the criteria" + criteria);
			}
			} else {
				System.out.println("your mains score" + interview +" is below the criteria" + criteria);
			}
			} else {System.out.println("your pre score" + interview + "is below the criteria" + criteria);}
		}
		// TODO Auto-generated method stub
	}

