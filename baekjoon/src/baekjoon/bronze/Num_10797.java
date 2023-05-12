package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_10797 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int day = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		
		for(int i = 0; i < 5; i++) {
			int carNum = Integer.parseInt(st.nextToken());
			if(carNum == day) {
				count++;
			}
		}
		System.out.println(count);
		
		
		br.close();

	}

}
