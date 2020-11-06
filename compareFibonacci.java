import java.util.ArrayList;

import javax.swing.JOptionPane;

public class compareFibonacci extends fibonacci1{
	
	int input = 0;
	ArrayList<Integer> fib;
	boolean fibonacci = false;
	public void getUserInput() {
		input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number, and we will check if it is in the fibonacci sequence"));
		
	}
	public void generateFib() {
		
		
		fib = makeFibonacci(makeArray(), input);
		
	}
	public boolean check() {
		for (int i: fib) {
			if (i == input) {
				fibonacci = true;
				break;
			}
			else {
				fibonacci = false;
			}
		
		}
		return fibonacci;
	}
	public void printResult() {
		if (fibonacci == true) {
			System.out.println("Your number is in the fibonacci sequence");
		
		}
		else {
			System.out.println("Your number is not in the fibonacci sequence");
		}
	}
	public boolean executeWithoutPrint() {
		getUserInput();
		generateFib();
		check();
		return check();
	}
	public void executeWithPrint() {
		executeWithoutPrint();
		printResult();
	}
	
}
