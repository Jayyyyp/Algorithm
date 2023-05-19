package recoding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Num_9012_rere {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			Stack<Character> stack = new Stack<>();
			String init = br.readLine();
			for(char c : init.toCharArray()) {
				if(c == '(') {
					stack.push(c);
				}else if(c == ')') {
					if(stack.isEmpty()) {
					stack.push(c);
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
