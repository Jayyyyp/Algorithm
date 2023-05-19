package baekjoon.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Num_9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>(); 

            for (char ha : input.toCharArray()) { 
            	// 문자열 input을 char형 배열로 변환하고, 배열의 각 원소를 순차적 처리 ex.['(',')']
                if (ha == '(') { // 문자가 '(' 이면~
                    stack.push(ha); // stack에 push
                } else if (ha == ')') { // 문자가 ')' 이면, 
                    if (stack.isEmpty()) { // stack이 비어있을 때,
                        stack.push(ha); // stack에 push하고,
                        break;		// 반복문 탈출
                    } else {	// stack이 비어있지 않으면,
                        stack.pop(); // stack에 pop
                    }
                }
            } // 배열에 원소넣는 for문

            if (stack.isEmpty()) { // stack이 비어있으면,
                bw.write("YES\n"); // YES 출력하고,
            } else {			   // stack이 비어있지 않으면,
                bw.write("NO\n");  // NO 출력하기
            }
        } // 테스트케이스 for문

        br.close();
        bw.flush();
        bw.close();
    }
}
