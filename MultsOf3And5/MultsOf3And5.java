package MultsOf3And5;

//Jerry Huang
//2/12/2016
//Problem 1


/*
* Problem:
* 
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
* The sum of these multiples is 23.
* 
* Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class MultsOf3And5 {
	
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		// Loop through all natural numbers below 1000
		for (int i = 0; i < 1000; i++) {
			
			if (multOf3(i) || multOf5(i)) {
				sum += i;
			}
		}
		
		System.out.println("Sum of all the multiples of 3 or 5 below 1000: " + sum);
	}
	
	
	/** Checks if number is a multiple of 3 */
	public static boolean multOf3(int num) {
		if (num % 3 == 0) return true;
		return false;
	}
	
	
	/** Checks if number is a multiple of 5 */
	public static boolean multOf5(int num) {
		if (num % 5 == 0) return true;
		return false;
	}
}
