import java.math.BigInteger;

// Jerry Huang
// 2/12/2016


/*
 * Problem:
 * 
 * n! means n × (n − 1) × ... × 3 × 2 × 1 
 * 
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * 
 * Find the sum of the digits in the number 100!
 */
public class FactorialDigitSum {
	
	
	public static void main(String[] args) {
		
		String factorial = factorialOf(100);
		int sum = findSum(factorial);
		System.out.println("Sum of the digits in the number 100!: " + sum);
	}
	
	
	/**
	 * Finds factorial of a number
	 * @param num: the number
	 * @return factorial: the factorial in a string
	 */
	public static String factorialOf(int num) {
		
		BigInteger fact = new BigInteger("1"); // BigInteger needed for large numbers
		
		for (int i = 1; i <= num; i++) {
			fact = fact.multiply(new BigInteger(i + ""));
		}
		return fact.toString();
	}
	
	
	/**
	 * Finds the sum of the digits in the factorial
	 * @param factorial: the factorial as a string
	 * @return sum: int sum of all the digits in the factorial
	 */
	public static int findSum(String factorial) {
		
		// Creates array with each digit
		String[] stringArray = factorial.split("");
		int sum = 0;
		
		for (int i = 0; i < stringArray.length; i++) {
			// Convert the numbers in string to int
			sum += Integer.parseInt(stringArray[i]); 
		}
		return sum;
	}
}
