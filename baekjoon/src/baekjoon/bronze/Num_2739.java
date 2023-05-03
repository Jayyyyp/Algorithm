package baekjoon.bronze;

import java.util.Scanner;

public class Num_2739 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result = 0;

		for(int i = 1; i <= 9; i++) {
			result = N * i;
			System.out.println(N + " * " + i + " = " + result);
		}
		scan.close();
	}

}
