package practiceDay2;

import MyJava.ArithmeticOperation;

public class Newnewclass {

	public static void main(String[] args) {
		
		ArithmeticOperation plus=new ArithmeticOperation();
		
		int num1=1000;
		int num2=100;
				
		System.out.println(plus.addition(num1, num2));
		System.out.println(plus.division(num1, num2));
		System.out.println(plus.multi(num1, num2));

	}

}
