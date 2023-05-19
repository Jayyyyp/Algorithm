package recoding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Num_9012_re {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			String input = br.readLine();
			Stack<Character> stack = new Stack<>();
			for(char ch : input.toCharArray()) {
				if(ch == '(') {
					stack.push(ch);
				} else if(ch == ')') {
					if(stack.isEmpty()) {
						stack.push(ch);
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(stack.isEmpty()) {
				bw.write("YES\n");
			}else {
				bw.write("NO\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
