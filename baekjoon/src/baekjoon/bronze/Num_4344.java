package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_4344 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int C = Integer.parseInt(br.readLine()); // 테스트케이스 수
		
		for(int i = 1; i <= C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 학생의 수
			int[] scores = new int[N]; // 점수를 배열에 저장하기 위해 배열 생성
			int sum = 0;
			
			// 점수 입력하는 반복문
			for(int j = 0; j < N; j++) { // 점수 배열 넣는 반복문
				int score = Integer.parseInt(st.nextToken()); 
				scores[j] = score; // score 입력받아 배열에 저장
				sum += score; // sum에 score값 저장
			}
			// 평균 뽑는 곳
			float studentsAvg = (float)sum / N;
			int overAvgStudents = 0; // 평균을 넘는 학생들을 세기 위한 변수
			// 평균값 비교 반복문
			for(int k = 0; k < N; k++) {
				if(studentsAvg < scores[k]) {
					overAvgStudents++;
				}
			}
			float result = ((float)overAvgStudents / N) * 100;
			System.out.printf("%.3f%%\n", result);

		}
		br.close();
	}
}
