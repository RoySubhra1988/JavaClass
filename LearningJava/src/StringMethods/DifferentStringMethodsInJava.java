package StringMethods;

public class DifferentStringMethodsInJava {

	public static void main(String[] args) {
		
		String s = "Welcome";
		
		System.out.println(s.length()); // how to find number of characters
		
		//Concatenation
		
		String s1 = "Welcome to my ";
		String s2 = "Class";
				
		System.out.println(s1+s2); // one way to concat two String
		
		System.out.println(s1.concat(s2));// Using concat() method
		
		//equals() method - comparing two Strings
		
		String s3 = "WELCOME";
		String s4 = "welcome";
		
		System.out.println(s3.equals(s4)); // equals() - false
		System.out.println(s3.equalsIgnoreCase(s4)); // equalsIgnoreCase() - true
		
		//Contains
		
		System.out.println(s3.contains("COME")); //true
		System.out.println(s3.contains("ABC")); //false
		
		//Substring
		
		System.out.println(s3.substring(0,3)); // W E L
		System.out.println(s3.substring(2,5));// C M O
		System.out.println(s3.substring(4,7));// O M E
		
		//Replace
		
		System.out.println(s3.replace('E', 'A')); // WALCOMA
		System.out.println(s3.replace("COME", "KOME")); //WELKOME
		
		
	}

}
