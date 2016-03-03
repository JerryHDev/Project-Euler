package SumSquareDifference;

//Jerry Huang
//2/13/2016
//Problem 6


/*
* Problem:
* 
* The sum of the squares of the first ten natural numbers is,
	1^2 + 2^2 + ... + 10^2 = 385
	
	The square of the sum of the first ten natural numbers is,
	(1 + 2 + ... + 10)^2 = 55^2 = 3025
	
	Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
	
	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
public class SumSquareDifference {
	
	
	public static void main(String[] args) {
		
		int limit = 100;
		
		int sumSquare = sumOfSquares(limit);
		int squareSum = squareOfSum(limit);
		
		int difference = squareSum - sumSquare;
		System.out.println("The difference between the two sums is: " + difference);
	}
	
	
	/** Finds the sum of the squares of the first 100 natural numbers */
	public static int sumOfSquares(int limit) {
		
		int retval = 0;
		for (int i = 1; i <= limit; i++) {
			retval += i*  i;
		}
		return retval;
	}
	
	
	/** Finds the square of the sum of the first 100 natural numbers */
	public static int squareOfSum(int limit) {
		int sum = 0;
		for (int i = 1; i <= limit; i++) {
			sum += i;
		}
		int retval = sum * sum;
		return retval;
	}

}
