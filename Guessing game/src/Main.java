import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to guessing game");
		System.out.println("B means the digit is in thw right place");
		System.out.println("C means taht the digit is right but in wrong position");
		
		//generating a random number
		Random random = new Random(); 
		int randomNum = random.nextInt(99);
		System.out.println(randomNum);
		
		//convert the random number to a string 
		String str = String.valueOf(randomNum);
		char c1 = str.charAt(0);
		char c2 = str.charAt(1);
		
		int input = sc.nextInt();
		
		//converting this input number to string 
		String str2 = String.valueOf(input);
		char i1 = str2.charAt(0);
		char i2 = str2.charAt(1);
		
		
		if(randomNum==input) {
			System.out.println("Congragutions you guessed right");
		}
		else if(c1==i1 || c2==i2) {
			System.out.println("1B0C");
		}
		
		else if(c1==i2 && c2==i1) {
			System.out.println("0B2C");
		}
		else if(c1==i2 && c2==i1) {
			System.out.println("0B1C");
		}
		
		else {
			System.out.println("0B0C");
		}
		
		
		
		
		
	}
	
}
