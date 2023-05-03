package baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Num_10818 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();
		int[] numbers = new int[arraySize]; // numbers개의 배열 선언
		for(int i = 0; i < arraySize; i++) {
			numbers[i] = scan.nextInt();
		}
		Arrays.sort(numbers);
		System.out.print(numbers[0] + " ");
		System.out.println(numbers[arraySize-1]);
		
		scan.close();

	}

}
