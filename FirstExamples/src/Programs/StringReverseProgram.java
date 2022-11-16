package Programs;

import java.util.Scanner;

public class StringReverseProgram {
	
	String originalString ="", reverseString="";
	
	char singleCharacter;
	
	
	public String reverseStringMethod(String originalString)
	{
		

		
		
		this.originalString= originalString;
		
		for(int i=0;i<originalString.length();i++)
		{
			singleCharacter = originalString.charAt(i);
			
			
			reverseString=  singleCharacter + reverseString;
			
		}
		
		return reverseString;
		
		
		
	}
	
	public static void main(String[] args) {
		
		StringReverseProgram srpObject = new StringReverseProgram();
		
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String givenString = scannerObject.nextLine();
		if(givenString.isEmpty()) {
			System.out.println("Enter a valid Stirng");
			System.exit(0);
		}else
		
		System.out.println("Reverde string is :"+srpObject.reverseStringMethod(givenString));
		
		
		
		
	}
	

}
