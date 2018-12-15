package MyJava;

public class TwoDArray {

	public static void main(String[] args) {
		int [][] numbers= {{2,3,4},{6,7,8},{9,10,11,12,13}};
		
		for (int row = 0; row < numbers.length; row++) 
			{
				for (int column = 0; column<numbers[row].length; column++) 
				{
					System.out.print(numbers[row][column]+"\t");
				}
				System.out.println();
			}
		
	}	

}
