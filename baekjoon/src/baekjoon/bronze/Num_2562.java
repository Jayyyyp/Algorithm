package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2562 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int maxIndex = 0;
		
		for(int i = 0; i < 9; i++) {
			int num = Integer.parseInt(br.readLine());	
			if(num > max) {
				max = num;
				maxIndex = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(maxIndex);


	}

}
