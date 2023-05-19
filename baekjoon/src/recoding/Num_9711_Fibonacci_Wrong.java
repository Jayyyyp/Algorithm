package recoding;

import java.io.*;
import java.util.*;

public class Num_9711_Fibonacci_Wrong {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++) { // 각 테스트 케이스에 대해 반복문실행
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());

            // 피보나치 수열을 저장할 배열
            // (피보나치수열 연산의 최대 주기가 Q * Q이기 때문에 Q*Q+1로 설정)

            int[] fib = new int[Q * Q + 1];
            fib[0] = 0; // 첫 번째 요소 초기화 0
            fib[1] = 1; // 두 번째 요소 초기화 1

            // 피사노 주기를 찾음
            int period = 0; // 피사노 주기를 저장할 변수
            for(int j = 2; j <= Q * Q; j++) { 
            	// 3번째 피보나치 수부터 계산을 시작하는 반복문
            	// Q * Q 까지 반복하는 이유는 피사노 주기의 최대길이가 Q * Q이기 때문
            	
                fib[j] = (fib[j - 1] + fib[j - 2]) % Q; // 피보나치의 나머지 계산
                
                if(fib[j - 1] == 0 && fib[j] == 1) { 
                	// 피사노 주기는 항상 0,1 로 시작하므로, 0과 1이면 피사노 주기를 찾은것
                    period = j - 1; // 피사노 주기의 길이를 period에 저장하고
                    break; // 주기를 찾았으므로 break;
                }
            }

            bw.write("Case #" + i + ": " + fib[P % period] + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

