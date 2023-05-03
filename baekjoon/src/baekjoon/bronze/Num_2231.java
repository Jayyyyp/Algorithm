package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int M = Integer.parseInt(br.readLine());
		int N = 0;
		
		br.close();
		
		 for (int i = 1; i < M; i++) {
	            int constructor = i;
	            int sum = constructor;

	            while (constructor != 0) {
	                sum += constructor % 10;
	                constructor /= 10;
	            }

	            if (sum == M) {
	                N = i;
	                break;
	            }
	        }

	        System.out.println(N);
		

	}

}
