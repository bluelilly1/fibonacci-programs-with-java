
public class findIndexOfFibonacci extends compareFibonacci{
	boolean fib1;
	int result;
	public void findIfInputIsFib() {
		fib1 = executeWithoutPrint();
	}
	public void stop() {
		if (fib1 == false) {
			System.out.println("Your number is not in the fibonacci sequence");
		}
		else {
			execute();
		}
	}
	public void execute() {
		findIndex();
	}
	
	public int findIndex() {
		
		for (int index = 0; index < fib.size(); index++) {
			if (fib.get(index) == input) {
				result = index;
			}
		}
		return result;	
	}
	public void print() {
		System.out.println("Your number is the " + String.valueOf(result) + "th number in the fibonacci sequence" );
	}
}
