
import java.util.Scanner;


public class fibonacci {

	static void PrimeNumber(int num1) {
		int count = 2;
		boolean primeOrNot = false;
		if (num1 == 1 || num1 == 2) {
			System.out.println("Your number is prime");
		}
		else {while (count <= Math.sqrt(num1) + 1) {
			int check = num1 % count;
			
			if (check == 0) {
				System.out.println("Your number isn't prime.");
				primeOrNot = false;
				break;
			}
			else {
				primeOrNot = true;
			}
			count++; 
			}
					
			if (primeOrNot == true) {
				System.out.println("Your number is prime");
			}			
		}
	}

	public static void main(String[] args) {
		System.out.println("Prime Number Checker");
		//user input
		Scanner num = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = num.nextInt();
		PrimeNumber(number);
	}
}
