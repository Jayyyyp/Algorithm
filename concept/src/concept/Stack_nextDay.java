package concept;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Stack_nextDay {
static int[] stack;
static int size = 0;
	public static void push(int X) {
		stack[size] = X;
		size++;
	}
	public static int pop() {
		if(size == 0) {
			return -1;
		}else {
			int outNum = stack[size-1];
			size--;
			return outNum;
		}
	}
	public static int size() {
		return size;
	}
	public static int empty() {
		if(size == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	public static int top() {
		if(size == 0) {
			return -1;
		}else {
			return stack[size-1];
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		stack = new int[N];
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "push" :
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop" :
				bw.write(pop() + "\n");
				break;
			case "size" :
				bw.write(size() + "\n");
				break;
			case "empty" :
				bw.write(empty() + "\n");
				break;
			case "top" :
				bw.write(top() + "\n");
				break;
			}
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}
