import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class checkSequence extends fibonacci1{
	String input;
	ArrayList<Integer> userSequence = new ArrayList<Integer>();
	ArrayList<Integer> fibSequence;
	ArrayList<Boolean> check = new ArrayList<Boolean>();
	boolean result;
	public void userInput() {
		input = JOptionPane.showInputDialog("Enter a sequence of numbers (seperated by commas), and I will check if it is fibonacci");
		
	}
	public void makeUserSequence() {
		
		StringTokenizer str = new StringTokenizer(input,", ");
		int value = Integer.valueOf(str.nextToken());
		userSequence.add(value);
		while (str.hasMoreTokens()) {
			userSequence.add(Integer.valueOf(str.nextToken()));
		}
		
	}
	public void getFibSequence() {
		fibSequence = makeFibonacci(makeArray(), userSequence.get(userSequence.size()-1) + 5);
	}
	public void compare() {
		for (int userVal: userSequence) {
			for (int fibVal: fibSequence) {
				if (userVal == fibVal) {
					check.add(true);
				}
			}
		}
	}
	public boolean compareOrdered() {
		int fib = 0;
		int user = 0;
		while( fib < fibSequence.size()) {
			if (userSequence.get(user) == fibSequence.get(fib)) {
				while (user < userSequence.size()) {
					user++;
					fib++;
					if (userSequence.get(user) == fibSequence.get(fib)) {
						result = true;
					}
					else {
						result = false;
						break;
					}
				}
			}
			else {
				fib++;
			}
		}
		
		return result;
	}
	public void printResult() {
		if (result == true) {
			System.out.println("Your sequence is a fibonacci sequence");
		}
		else {
			System.out.println("Your sequence is not a fibonacci sequence");
		}
	}
	public boolean findResultUnordered() {
		result = false;
		if (check.size() == userSequence.size()) {
			result = true;
			System.out.println("The numbers in your sequence are in the fibonacci sequence.");
		}
		else {
			System.out.println("The numbers in your sequence are not in the fibonacci sequence.");
		}
		return result;
	}
	public void execute() {
		userInput();
		makeUserSequence();
		getFibSequence();
		compare();
		findResultUnordered();
		if (findResultUnordered() == true) {
			compareOrdered();
			printResult();
		}
	}
}
