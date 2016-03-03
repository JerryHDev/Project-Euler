package SmallestMultiple;

//Jerry Huang
//2/13/2016
//Problem 5


/*
* Problem:
* 
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
* 
* What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
public class SmallestMultiple {
	
	
	public static void main(String[] args) {
		
		int number = 1;
		while (!divisibleBy1to20(number)) {
			number++;
		}
		
		System.out.println("Smallest positive number that is evenly divisible by all of the numbers from 1 to 20: " + number);
	}
	
	
	/** Checks if the number is evenly divisible by all of the numbers from 1 to 20 */
	public static boolean divisibleBy1to20(int number) {
		
		for (int i = 1; i <= 20; i++) {
			
			if (number % i != 0)
				return false;
		}
		return true;
	}

}
