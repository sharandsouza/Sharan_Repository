package MyJava;

public class SwitchStatements {

	public static void main(String[] args) {
	
	int monthnumber=9;	
	
	switch (monthnumber) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("The month has 31 days");
	break;
		case 4:
		case 6:
		case 9:
			System.out.println("The month has 30 days");
	break;	
		case 2:
			System.out.println("The month has 28 days");
	break;
	default:
			System.out.println("The month is Invalid");
	break;
		}

	}

}
