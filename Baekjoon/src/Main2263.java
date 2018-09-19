import java.util.Scanner;
import java.util.Stack;

public class Main2263 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int node = sc.nextInt();
		int[] inorder = new int[node + 1];
		int[] postorder = new int[node + 1];
		int[] preorder = new int[node + 1];
		for (int i = 0; i < node; i++) {
			inorder[i] = sc.nextInt();
		}
		for (int i = 0; i < node; i++) {
			postorder[i] = sc.nextInt();
		}
		int k = 1;
		int top = 0;
		while(true) {
			top = postorder[node];
			preorder[k] = top;
			
		}

	}

}
