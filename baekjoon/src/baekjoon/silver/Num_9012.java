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

            for (char init : input.toCharArray()) { 
            	// 문자열 input을 char형 배열로 변환하고, 배열의 각 원소를 순차적 처리 ex.['(',')']
                if (init == '(') { // 문자가 '(' 이면~
                    stack.push(init); // stack에 push
                } else if (init == ')') { // 문자가 ')' 이면, 
                    if (stack.isEmpty()) { // stack이 비어있을 때,
                        stack.push(init); // stack에 push하고,
                        break;		// 반복문 탈출(없어도 동작은 되지만, 효율적이게 작동)
     // 이미 ')'가 '(' 없이 먼저 나온 시점은 괄호를 만들 수 없기 때문에 탈출시켜서 성능 향상(큰 데이터 처리 가능)
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
