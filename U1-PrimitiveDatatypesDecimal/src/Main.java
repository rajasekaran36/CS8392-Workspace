/*==================================================
 * @author Rajasekaran S
 * @version 1.0
 * Subject:Object Oriented Programming
 * Subject Code:CS8382
 * Concept:Demo of Basic Integer Data Types of Java 
 ===================================================*/
public class Main {

	public static void main(String[] args) {
		int i;
		short s;
		long l;
		byte b;
		
		/*------RANDOM NUMBER------*/
		i = 88383;
		s = 3793;
		l = 973792977L;
		b = 120;
		
		System.out.println("Basic Integer Test in Java");
		System.out.println("--------------------------");
		System.out.println("\nTesting with Random Numbers");
		System.out.println("'''''''''''''''''''''''''''");
		System.out.println("[Integer] Value of i :"+i);
		System.out.println("[Short]   Value of s :"+s);
		System.out.println("[Long] Value of l"+l);
		System.out.println("[Byte] Value of b:"+b);
		
		/*------RANDOM NUMBER END------*/
		
		/*------POSITIVE MAXIMUMS------*/
		
		i = 2147483647;
		s = 32767;
		l = 9223372036854775807L;
		b = 127;
		
		System.out.println("\nTesting with Positive Maximum");
		System.out.println("'''''''''''''''''''''''''''''");
		System.out.println("[Integer] Value of i :"+i);
		System.out.println("[Short]   Value of s :"+s);
		System.out.println("[Long] Value of l"+Long.MAX_VALUE);
		System.out.println("[Byte] Value of b:"+b);		
		
		/*------POSITIVE MAXIMUM ENDS------*/
		
		/*------NEGATIVE MAXIMUM------*/
		
		i = -2147483648;
		s = -32768;
		l = -9223372036854775808L;
		b = -128;
		
		System.out.println("\nTesting with Negative Maximum");
		System.out.println("'''''''''''''''''''''''''''''");
		System.out.println("[Integer] Value of i :"+i);
		System.out.println("[Short]   Value of s :"+s);
		System.out.println("[Long] Value of l"+Long.MAX_VALUE);
		System.out.println("[Byte] Value of b:"+b);		
		
		/*------POSITIVE MAXIMUM ENDS------*/
		
		/*------BEYOUND RANGE------*/
		
		/*
		 * Uncomment this lines and try
		i = 2147483648;
		s = 32768;
		l = 9223372036854775808L;
		b = 128;
		
		System.out.println("\nTesting with Beyond Range");
		System.out.println("'''''''''''''''''''''''''''''");
		System.out.println("[Integer] Value of i :"+i);
		System.out.println("[Short]   Value of s :"+s);
		System.out.println("[Long] Value of l"+Long.MAX_VALUE);
		System.out.println("[Byte] Value of b:"+b);		
		*/
		
		/*------BEYOUND RANGE ENDS------*/
		
	}

}
