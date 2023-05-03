package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2741 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		int number = Integer.parseInt(N);
		
		for(int i = 1; i <= number; i++) {
			System.out.println(i);
		}
		
		br.close();

	}

}
