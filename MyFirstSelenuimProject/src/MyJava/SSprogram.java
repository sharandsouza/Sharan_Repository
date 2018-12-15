package MyJava;

public class SSprogram {

	public static void main(String[] args) {
		String firstname= "sharan";
		String lastname= "dsouza";
		
		String sentence="My name is sharat dsouza";
		
		String newname ="quadros";
		String oldname ="Quadros";
		System.out.println(firstname+lastname);
		
		System.out.println(firstname.concat(lastname));
		
		System.out.println(firstname.length());
		
		System.out.println(firstname.charAt(2));
		
		System.out.println(firstname.toLowerCase());
		
		System.out.println(firstname.toUpperCase());
		
		System.out.println(newname.equals(oldname));
		
		System.out.println(newname.equalsIgnoreCase(oldname));
		
		System.out.println(firstname.replace('h', 'Y'));
		
		System.out.println(sentence.substring(2,5));
		
		System.out.println(sentence.split(" ")[0]);
		
		System.out.println(sentence.split(" ")[1]);
		
		System.out.println(sentence.split(" ")[2]);
		
	}
	
}
