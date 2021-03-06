package TriangularNumber;

//Jerry Huang
//2/13/2016
//Problem 12


/*
* Problem:
* 
* The sequence of triangle numbers is generated by adding the natural numbers. 
* So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
* 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
* Let us list the factors of the first seven triangle numbers:

	 1: 1
	 3: 1,3
	 6: 1,2,3,6
	10: 1,2,5,10
	15: 1,3,5,15
	21: 1,3,7,21
	28: 1,2,4,7,14,28
	
	We can see that 28 is the first triangle number to have over five divisors.
	
	What is the value of the first triangle number to have over five hundred divisors?
*/
public class TriangularNumber {
	
	public static void main(String[] args) {
		
		int triangularNumber = 1;
		int count = 2;
		
		while(!over5HundredDivisors(triangularNumber)) {
			System.out.print("\n" + triangularNumber);
			triangularNumber = triangularNumber + count;
			count++;
		}
		
		System.out.println(triangularNumber);
	}
	
	/** Checks whether the triangular number has over five hundred divisors */
	public static boolean over5HundredDivisors(int triangularNumber) {
		
		int divisors = 0;
		for (int i = 1; i <= triangularNumber; i++) {
			if (triangularNumber % i == 0) 
				divisors++;
		}
		System.out.print("Number of divisors: " + divisors);
		
		if (divisors > 500)
			return true;
		return false;
	}

}
