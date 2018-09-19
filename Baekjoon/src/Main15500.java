import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main15500 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		Stack<Integer> A = new Stack<Integer>();
		Stack<Integer> B = new Stack<Integer>();
		Stack<Integer> C = new Stack<Integer>();
		int[] order = new int[N];
		
		for (int i = 0; i < N; i++) {
			int current = Integer.parseInt(st.nextToken());
			A.push(current);
			order[i] = current;
		}
		
		Queue<String> queue = new LinkedList<String>();
		
		Arrays.sort(order);
		int max = N-1;
		int count = 0;
		while(!A.isEmpty() || !B.isEmpty()) {
			while(!A.isEmpty() && A.contains(order[max])) {
				int current = A.pop();
				if(current == order[max]) {
					C.push(current);
					max--;
					count++;
					queue.offer("1 3");
					continue;
				}	
				else {
					B.push(current);
					count++;
					queue.offer("1 2");
				}
					
			}
			
			while(!B.isEmpty() && B.contains(order[max])) {
				int current = B.pop();
				if(current == order[max]) {
					C.push(current);
					max--;
					count++;
					queue.offer("2 3");
					continue;
				}	
				else {
					A.push(current);
					count++;
					queue.offer("2 1");
				}
					
			}
			
		}
		
		System.out.println(count);
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
