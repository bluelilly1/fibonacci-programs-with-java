import java.util.ArrayList;

import javax.swing.JOptionPane;

public class fibonacci1 {
	int limit = 0;
	public void execute() {
		
		makeFibonacciWithoutLimit(makeArray(), getLimit());
	}
	public int getLimit() {
		limit = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the limit"));
		return limit;
		
	}
	public ArrayList<Integer> makeArray() {
		ArrayList<Integer> fib = new ArrayList<Integer>();
		fib.add(0);
		fib.add(1);
		return fib; 
	}
	public ArrayList<Integer> makeFibonacciWithoutLimit(ArrayList <Integer> fib, int limit) {
		int value = fib.get(fib.size()-1) + fib.get(fib.size() - 2);
		while (value < limit) {
			
			fib.add(value);
			value = fib.get(fib.size()-1) + fib.get(fib.size() - 2);
		}
		System.out.println(fib);
		
		return fib;
	}
	public ArrayList<Integer> makeFibonacci(ArrayList <Integer> fib, int limit) {
		int value = 0;
		while (value < limit) {
			value = fib.get(fib.size()-1) + fib.get(fib.size() - 2);
			fib.add(value);
			
		}
		System.out.println(fib);
		
		return fib;
		
	}
	
}
