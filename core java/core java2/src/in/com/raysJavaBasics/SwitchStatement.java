package in.com.raysJavaBasics;

public class SwitchStatement {
public static void main(String[] args) {
	//switch(variable){
	//case 1:variable se compare
	//case 2:variable
	//case3:variable
	//default:variable
	
	int number = 5;
	switch(number) {
	case 1 : System.out.println("Fan On");
	           break;
	case 2 : System.out.println("Light On");
	           break;
	case 3 : System.out.println("Charging On");
	           break;
	default : System.out.println("Power Off");
	}
	
	
	
}
}
