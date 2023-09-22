package week2.day3;

public class StringTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="liberty";
	
		String uppercase = "LIBERTY";
		System.out.println(uppercase.toLowerCase());

		String lowercase = "liberty";
		System.out.println(lowercase.toUpperCase());
		
		System.out.println(name.contains("l"));
		System.out.println("*********************************************");
		  
		System.out.println(name.contains("Z"));
		System.out.println("*********************************************");  
		
		System.out.println(name.concat("institute"));
		
		char[] charArray = name.toCharArray();

		for (int i=charArray.length-1; i>=0; i--) {
	
		System.out.print(charArray[i]);
		
	   }
	   }
	   }


