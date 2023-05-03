package baekjoon.bronze;

import java.util.Scanner;

public class Num_2441 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j < i; j++) 
			System.out.print(" ");
			
			for(int j = star; j >= i; j--) 
				System.out.print("*");
				System.out.println();
		
		}
		scan.close();
	}

}
