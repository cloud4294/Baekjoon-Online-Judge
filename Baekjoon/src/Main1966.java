import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1966 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			List<Integer> queue = new ArrayList<Integer>();
			List<Integer> index = new ArrayList<Integer>();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int max = 0;
			int count = 0;
			for (int j = 0; j < n; j++) {
				queue.add(sc.nextInt());
				index.add(j);
				if(queue.get(j) > max)
					max = queue.get(j);
			}
			while(true) {
				if(queue.isEmpty()) {
					return;
				}
				if(queue.get(0) == max) {
					count++;
					if(index.get(0) == m) {
						output.add(count);
						break;
					}
					queue.remove(0);
					index.remove(0);
					max = 0;
					for (int j = 0; j < queue.size(); j++) {
						if(queue.get(j) > max)
							max = queue.get(j);
						
					}
				}
				else {
					int swap = queue.get(0);
					queue.remove(0);
					queue.add(swap);
					swap = index.get(0);
					index.remove(0);
					index.add(swap);
				}
			}
		}
		for(int out:output) {
			System.out.println(out);
		}
	}

}
