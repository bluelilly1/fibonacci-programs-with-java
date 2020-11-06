import java.util.Scanner;
import java.util.ArrayList;
public class FibonacciGenerator {
	//generate fibonacci numbers from 1 to user input
	static void FibonacciA (int limit) {
		ArrayList <Integer> fibonacci = new ArrayList<Integer>();
		fibonacci.add(0);
		fibonacci.add(1);
		int number = 0;

				while (number < limit) {
			int num2 = fibonacci.size()-1;
			int num1 = fibonacci.size()-2;
			number = fibonacci.get(num2) + fibonacci.get(num1);
			fibonacci.add(number);		
		}
		
		for (int i = 0; i < fibonacci.size(); ++i) {
			System.out.println(fibonacci.get(i));
		}

	}
	
	public static void main(String[] args) {
		System.out.println("Fibonacci Generator");
		//user input 
		Scanner limitCheck = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int limit = limitCheck.nextInt();
		FibonacciA(limit);

	}

}
