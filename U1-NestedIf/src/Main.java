import java.io.*;
class Main{
	public static void main(String[] args){
		int a = 11;
		if(a<10){
			System.out.println("a is less than 10");
			if (a%3 == 0){
				System.out.println("a is divisible by 3");
			}
			else{
				System.out.println("a is not divisible by 3");
			}
		}
		else{
			System.out.println("a is greater than or equal to 10");
		}
	}
}