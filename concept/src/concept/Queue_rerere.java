package concept;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Queue_rerere {
static int[] queue;
static int size = 0;
static int front = 0;
static int back = 0;

	public static void push(int X) {
		queue[back++] = X;
		size++;
	}
	public static int pop() {
		if(size == 0) {
			return -1;
		}else {
			size--;
			return queue[front++];
		}
	}
	public static int size() {
		return size;
	}
	public static int empty() {
		return size == 0 ? 1 : 0;
	}
	public static int front() {
		if(size == 0) {
			return -1;
		}else {
			return queue[front];
		}
	}
	public static int back() {
		if(size == 0) {
			return -1;
		}else {
			return queue[back - 1];
		}
	}
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		queue = new int[N];
		
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
			case "front" :
				bw.write(front() + "\n");
				break;
			case "back" :
				bw.write(back() + "\n");
				break;
			}
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}
