package practiceDay2;

public class ShareFunctionTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=100;
		int num2=10;
		
		ShareFunction Instance= new ShareFunction();
	
		System.out.println(Instance.addition(num1,num2));
		System.out.println(Instance.substraction(num1,num2));
		System.out.println(Instance.multiplication(num1,num2));
		System.out.println(Instance.division(num1,num2));
		System.out.println(Instance.reminder(num1,num2));
	}

}
