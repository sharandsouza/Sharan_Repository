package MyJava;

public class AdditionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=30;
		int num2=2;
		
		ArithmeticOperation MyOperation = new ArithmeticOperation();
		
		System.out.println(MyOperation.addition(num1, num2));
		System.out.println(MyOperation.division(num1, num2));
		System.out.println(MyOperation.reminder(num1, num2));
		System.out.println(MyOperation.multi(num1, num2));
		System.out.println(MyOperation.substraction(num1, num2));

	}
	
	}

