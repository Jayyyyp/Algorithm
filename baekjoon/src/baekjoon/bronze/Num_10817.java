package baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Num_10817 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] Array = new int[3];

		for(int i = 0; i < 3; i++) {
			Array[i] = s.nextInt();
		}
		Arrays.sort(Array);
		System.out.println(Array[1]);
		
		s.close();
		
	}

}
