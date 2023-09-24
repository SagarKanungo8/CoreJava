package in.core2.rays;

public class Levels {

	public static void main(String[] args) {
		int LevelA = 70, LevelB = 85, LevelC = 90, eligiblity = 75;
		if(LevelA >= eligiblity) {
		if(LevelB >= eligiblity) {	
	    if(LevelC >= eligiblity) {
	    	System.out.println("You Are Eligible For Selection");
	    } else {
	    	System.out.println("LevelC score" + LevelC + "is below the eligiblity" + eligiblity);
	    } 
		} else {
	    	System.out.println("LevelB score" + LevelB + "is below the eligiblity" + eligiblity);
	    } 
	    } else {
	    	System.out.println("LevelA score" + LevelA + "is below the eligiblity" + eligiblity);
	    } 
	    }
		}
		// TODO Auto-generated method stub

