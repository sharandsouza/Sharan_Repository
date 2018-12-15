package MyJava;

public class ConditionStatements {

	public static void main(String[] args) {
		int marks=59;
		
		if (marks>60)
		{
			System.out.println("Distinction");
		}
		else if (marks>50 && marks<60)
		{
			System.out.println("First Class");
		}
		else if (marks<50)
		{
			System.out.println("Second Class");
		}
		

	}

}
