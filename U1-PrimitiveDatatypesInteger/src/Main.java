/*==================================================
 * @author Rajasekaran S
 * @version 1.0
 * Subject:Object Oriented Programming
 * Subject Code:CS8382
 * Concept:Demo of Basic Decimal Data Types of Java 
 ===================================================*/
public class Main {

	public static void main(String[] args) {
		float f;
		double d;
		
		/*------RANDOM NUMBER------*/
		f = 78.98995998998008779977686676876878989889f;
		d = 7494.949499302309030899997979779979797979977989696886;
		
		System.out.println("Basic Decimal Test in Java");
		System.out.println("--------------------------");
		System.out.println("\nTesting with Random Numbers");
		System.out.println("'''''''''''''''''''''''''''");
		System.out.println("[Float] Value of i :"+f);
		System.out.println("[Double]   Value of s :"+d);
		
		/*------RANDOM NUMBER END------*/
		
		/*------MAX------*/
		f = Float.MAX_VALUE;
		d = Double.MAX_VALUE;
		
		System.out.println("\nMAX Values");
		System.out.println("'''''''''''''");
		System.out.println("[Float] Value of i :"+f);
		System.out.println("[Double]   Value of s :"+d);
		
		/*------MAX END-----*/
	}

}
