package baekjoon.bronze;

import java.util.Scanner;

public class Num_10952 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		while(true) {
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			if(n1 == 0 & n2 == 0) {
				break;
			}
			int result = n1 + n2;
			System.out.println(result);
		}

	}

}
