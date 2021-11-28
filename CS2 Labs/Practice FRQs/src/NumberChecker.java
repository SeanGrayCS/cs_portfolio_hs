import java.util.*;

public class NumberChecker {

	public static int getNumber() {
		return 0;
	}
	
	public static boolean isTarget(int x) {
		return false;
	}
	
	public static int countNumbers(int n, int max)
	{
		int totalNumbers = 0;
		int numsCounted = 0;
		for (int i = 0; i < max; i++) {
			int num = getNumber();
			totalNumbers++;
			if (!isTarget(num) && (num % 3 == 0)) {
				numsCounted++;
				if (numsCounted == n) {
					return totalNumbers;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
	}

}
