package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2742 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		int number = Integer.parseInt(N);
		
		while(number != 0) {
			System.out.println(number);
			number--;
		}
		
		br.close();

	}

}
