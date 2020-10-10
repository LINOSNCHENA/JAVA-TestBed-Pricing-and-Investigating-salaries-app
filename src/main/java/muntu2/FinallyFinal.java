package muntu2;

public class FinallyFinal {
	public static void main(String[] args) {
		try {
			FinallyFinal.divideByZero(100, 10);
			System.out.println("\n finally in main #1 \n");
		} // Jumps to #2
		finally {
			System.out.println("\n ALWAYS EXECUTED finally in main at line #2 \n");
		}
	}

	public static void divideByZero(int n, int div) {
		try {
			int nonZeroValue = n / div;
			System.out.println("\n divideByNonZERO #3 : " + nonZeroValue);
			System.out.println(" finally in main #3 \n");
		} finally {
			System.out.println("\n ALWAYS EXECUTED finally of divideByZero #4 \n ");
		}
	}
}