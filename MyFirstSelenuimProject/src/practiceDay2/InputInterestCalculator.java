package practiceDay2;

import java.util.Scanner;

public class InputInterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the principal amount:");
		float principle=s.nextFloat();
		
		System.out.println("Enter the interest:");
		float interest=s.nextFloat();
	
		System.out.println("Enter the period:");
		float period=s.nextFloat();
		
		float simpleinterest= (principle*interest*period)/100;
		
		System.out.println("The simple interest for the period is:" +simpleinterest);
	}

}
//Scanner s = new Scanner(System.in);
//Scanner is a class file, s is the object. We need to create an instance to call this class file.
//Hence we are writing this instance.
//We have to create objects for 

//s.nextFloat() will allow the user to type in the value.
