package Assignment5_String;

import java.util.Scanner;

public class Strings_isPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.println(isPalindrome(str));

	}

	// Palindrome Checker
	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			
			i++;
			j--;

		}

		return true;
	}

}
