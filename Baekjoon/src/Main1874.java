import java.util.Scanner;
import java.util.Stack;

public class Main1874 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			Stack<Integer> stack = new Stack<Integer>();
			Stack<String> output = new Stack<String>();
			int[] input = new int[num];
			for (int i = 0; i < num; i++) {
				input[i] = sc.nextInt();
			}
			
			int index =0;
			int countplus = 0;
			int countminus =0;
			for (int i = 1; i <= num; i++) {
				output.push("+");
				countplus++;
				stack.push(i);
				while(stack.get(stack.size()-1) == input[index]) {
					output.push("-");
					countplus--;
					index++;
					stack.pop();
					if(stack.isEmpty()) {
						break;
					}
				}
			}
			if(countplus == countminus) {
				for(String out:output) {
					System.out.println(out);
				}
			}else {
				System.out.println("NO");
			}
			
		}
}
