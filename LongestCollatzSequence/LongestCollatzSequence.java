package LongestCollatzSequence;

//Jerry Huang
//2/15/2016
//Problem 14


/*
* Problem:
* 
* The following iterative sequence is defined for the set of positive integers:

	n → n/2 (n is even)
	n → 3n + 1 (n is odd)

	Using the rule above and starting with 13, we generate the following sequence:

	13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
	It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
	Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

	Which starting number, under one million, produces the longest chain?

	NOTE: Once the chain starts the terms are allowed to go above one million.
*/
public class LongestCollatzSequence {
	
	
	static int longestChain = 0;

	public static void main(String[] args) {
		
		for (int startNum = 13; startNum < 1000000; startNum++) {
			
			int chainLength = runCollatzSequence(startNum);
			if (chainLength > longestChain)
				longestChain = chainLength;
			
			System.out.println("Start Num: " + startNum);
		}
		
		System.out.println("Longest chain: " + longestChain);
	}
	
	
	public static int runCollatzSequence(int num) {
		
		int chainLength = 1;
		
		while (num != 1 || num > 1) {
			
			if (num % 2 == 0) {
				num /= 2;
				chainLength++;
				
			}
			else {
				num = (3 * num) + 1;
				chainLength++;
				
			}
		}
		
		return chainLength;
	}
	

}

