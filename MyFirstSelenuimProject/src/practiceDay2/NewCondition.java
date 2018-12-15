package practiceDay2;

public class NewCondition {

	public static void main(String[] args) {
		
		int marks=76;
		
		if (marks>75) 
		{
			System.out.println("Distinction");
		}
		else if (marks>=35 && marks<=75) 
		{
			System.out.println("Pass");
		}
		else if (marks<35) 
		{
			System.out.println("Fail");
		}
		
	}

}
