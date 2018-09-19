import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main15926 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		Stack<Integer> stack = new Stack<Integer>();

		int length = 0;
		int max = 0;
		int[] check = new int[N];
		
		for (int i = 0; i < N; i++) {
			if (input.charAt(i) == '(') {
				stack.push(i);
			} else if (input.charAt(i) == ')') {
				if (!stack.isEmpty()) {
					check[i] = 1;
					check[stack.get(stack.size()-1)] = 1;
					stack.pop();
				}
			}

		}
		
		for (int i = 0; i < N; i++) {
			if(check[i] == 1) {
				length++;
			}else if(check[i] == 0) {
				if(length > max) {
					max = length;
				}
				length = 0;
			}
			
		}
		
		System.out.println(Math.max(length, max));

	}

}
