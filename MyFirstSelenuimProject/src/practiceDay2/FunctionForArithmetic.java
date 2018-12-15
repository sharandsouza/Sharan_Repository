package practiceDay2;

public class FunctionForArithmetic {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1=40;
		int num2=10;
		
		System.out.println(addition(num1,num2));
		System.out.println(substraction(num1,num2));
		System.out.println(multiplication(num1,num2));
		System.out.println(division(num1,num2));
		System.out.println(reminder(num1,num2));
	}
		public static int addition (int num1,int num2)
		{
			int sum;
			sum= num1 +num2;
			return sum;
		}
		public static int substraction(int num1, int num2)
		{
			int substraction;
			substraction=num1-num2;
			return substraction;
		}
		public static int multiplication(int num1, int num2)
		{
			int multiplication;
			multiplication=num1*num2;
			return multiplication;
		}	
		public static int division(int num1, int num2)
		{
			int division;
			division=num1/num2;
			return division;
		}
		public static int reminder(int num1, int num2)
		{
			int reminder;
			reminder=num1%num2;
			return reminder;
		}
}

