package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_2530 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()); // 줄 바꾸기
		int D = Integer.parseInt(st.nextToken());
		
		br.close();
		
		 C += D;
	        if (C >= 60) {
	            B += C / 60;
	            C %= 60;
	        }
	        if (B >= 60) {
	            A += B / 60;
	            B %= 60;
	        }
	        if (A >= 24) {
	            A %= 24;
	        }
				System.out.println(A +" "+ B +" "+ C +" ");
			}
		}


