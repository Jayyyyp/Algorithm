package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num_1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		float M[] = new float[N];
		float result = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			M[i] = Integer.parseInt(st.nextToken());
			}
		Arrays.sort(M);
		for(int j = 0; j < N; j++) {
			M[j] = M[j]/M[N-1] * 100;
			result += M[j]; 
		}
		result /= N;
		System.out.println(result);
		br.close();

	}

}

