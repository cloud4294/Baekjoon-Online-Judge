import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int i = 0; i < testcase; i++) {
			int N = sc.nextInt();
			int L = sc.nextInt();
			int k = sc.nextInt();
			List<Integer> time = new ArrayList<Integer>();
			for (int j = 0; j < N; j++) {
				int position = sc.nextInt();
				int id = sc.nextInt();
				if(id < 0) {
					time.add(0, position);
				}
				else {
					time.add(time.size(), position);
				}
				
			}
			for(int out: time) {
				System.out.println(out);
			}
			
		}
	}

}
