package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_10039 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Arr[] = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			String token = st.nextToken();
			int score = Integer.parseInt(token);
			
			Arr[i] = score;
			if(Arr[i] < 40) {
				Arr[i] = 40;
			}
			sum += Arr[i];
		}
		System.out.println(sum/Arr.length);
		
		
		br.close();

	}

}
