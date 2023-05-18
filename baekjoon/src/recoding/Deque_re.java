package recoding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Deque_re {
static int[] deque;
static int size = 0;
static int front = 0;
static int back = 0;
	public static void push_front(int X) {
		front = (front - 1 + deque.length) % deque.length;
		deque[front] = X;
		size++;
	}
	public static void push_back(int X) {
		deque[back] = X;
		back = (back + 1) % deque.length;
		size++;
	}
	public static int pop_front() {
		if(size == 0) {
			return -1;
		}else {
			int outNum = deque[front];
			front = (front + 1) % deque.length;
			size--;
			return outNum;
		}
	}
	public static int pop_back() {
		if(size == 0) {
			return -1;
		}else {
			back = (back - 1 + deque.length) % deque.length;
			int outNum = deque[back];
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
	public static int front() {
		if(size == 0) {
			return -1;
		}else {
			return deque[front];
		}
	}
	public static int back() {
		if(size == 0) {
			return -1;
		}else {
			return deque[(back - 1 + deque.length) % deque.length];
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		deque = new int[N];
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "push_front":
				push_front(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				push_back(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				bw.write(pop_front() + "\n");
				break;
			case "pop_back":
				bw.write(pop_back() + "\n");
				break;
			case "size":
				bw.write(size() + "\n");
				break;
			case "empty":
				bw.write(empty() + "\n");
				break;
			case "front":
				bw.write(front() + "\n");
				break;
			case "back":
				bw.write(back() + "\n");
				break;
			}
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
