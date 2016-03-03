package PowerDigitSum;

//Jerry Huang
//2/13/2016
//Problem 16


/*
* Problem:
* 
* 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
* 
* What is the sum of the digits of the number 2^1000?
*/
public class PowerDigitSum {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(baseToPower(2, 1000));

	}
	
	
	
	public static double baseToPower(double baseNum, double exponent) {
		
		if (exponent == 0) {
			return 1;
		}
		
		else if (exponent == 1) {
			return baseNum;
		}
		
		else if (exponent == 2) {
			return baseNum * baseNum;
		}
		
		else if (exponent % 2 == 0) {
			return baseToPower(baseNum * baseNum, exponent / 2);
		}
		
		else {
			return baseNum * baseToPower(baseNum * baseNum, (exponent - 1) / 2);
		}
		
	}

}

