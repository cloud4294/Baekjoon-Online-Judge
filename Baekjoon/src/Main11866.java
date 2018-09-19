import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main11866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> queue = new ArrayList<Integer>();
		List<Integer> output = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		int k = 0;
		while(queue.isEmpty() == false) {
			k++;
			if(k < m) {
				int swap = queue.get(0);
				queue.remove(0);
				queue.add(swap);
			}
			else {
				output.add(queue.get(0));
				queue.remove(0);
				k = 0;
			}
		}
		System.out.print("<");
		for (int i = 0; i < output.size(); i++) {
			if(i < output.size()-1) {
				System.out.print(output.get(i)+", ");
			}
			else {
				System.out.print(output.get(i));
			}
		}
		System.out.print(">");
	}

}
