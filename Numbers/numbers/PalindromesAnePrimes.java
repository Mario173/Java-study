package numbers;

import java.util.Arrays;

/**
 * Class for testing if integer n, 0<=n<=999, is a palindrome (if 0<=n<=99)
 * or if it's a prime number (if 100<=n<=999)
 * @author Mario
 *
 */
public class PalindromesAnePrimes {
	/**
	 * Method that checks if the given one or two-digit number is a palindrome
	 * @param n integer in the interval [0,99]
	 * @return true if n is a palindrome, false otherwise
	 */
	public static boolean isOneOrTwoDigitNumberAPalindrome(int n) {
		try {
			if(n < 0 || n > 99) {
				throw new RangeException("One or two-digit numbers", 0, 99);
			}
		} catch(RangeException e) {
			System.out.println(e.message);
			e.printStackTrace();
			System.exit(1); // stop the execution when an exception occurs
		}	
		if(n < 10) {
			return true;
		}
		return (n / 10) == (n % 10);
	}
	
	/**
	 * Method that checks if the given three-digit number is prime
	 * @param n integer in the interval [100,999]
	 * @return true if n is prime, false otherwise
	 */
	public static boolean isNumberPrime(int n) {
		try {
			if(n < 100 || n > 999) {
				throw new RangeException("Three-digit number", 100, 999);
			}
		} catch(RangeException e) {
			System.out.println(e.message);
			e.printStackTrace();
			System.exit(1); // stop the execution when an exception occurs
		}
		boolean isPrime[] = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		for(int i = 2; i * i <= n; i++) {
			if(isPrime[i] == true) {
				for(int j = i * i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}
		return isPrime[n];
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			if(isOneOrTwoDigitNumberAPalindrome(i)) {
				System.out.println(i + " is a palindrome.");
			}
		}
//		Faster solution: All one-digit numbers are palindromes, and a two-digit number is a palindrome
//		if and only if it's first digit is equal to it's second digit, and that is true for two-digit
//		numbers if and only if that number is divisible by 11
//		for(i = 0; i < 10; i++) {
//			System.out.println(i + " is a palindrome.");
//		}
//		for(i = 11; i < 100; i += 11) {
//			System.out.println(i + " is a palindrome.");
//		}
		for(int i = 100; i < 1000; i++) {
			if(isNumberPrime(i)) {
				System.out.println(i + " is prime.");
			}
		}
//		Another possible solution for finding prime numbers: If we're trying to find all prime numbers
//		in the interval [low,high - 1], there is no need to run sieve of Eratosthenes for each number in
//		that interval, it's enough to run it once for integer high, return the array isPrime and check
//		if the isPrime[num] == true
//		int low = 100, high = 1000;
//		boolean isPrime[] = new boolean[high];
//		isPrime = sieveOfEratosthenes(high);
//		for(int i = low; i < high; i++) {
//			if(isPrime[i]) {
//				System.out.println(i + " is prime.");
//			}
//		}
		
	}
}
