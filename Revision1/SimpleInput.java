package Revision1;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			int n = sc.nextInt();
			sum += n;
			if (sum >= 0) {
				System.out.println(n);
			} else {
				sc.close();
				return;
			}
		}
		
		

	}

}
