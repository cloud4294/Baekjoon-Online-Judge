import java.util.Scanner;

public class Main2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			int t = i;
			int sum = i;
			while(t != 0) {
				sum += t % 10;
				t /= 10;
			}
			if(sum == N) {
				System.out.println(i);
				return;
			}
			
		}
		System.out.println(0);
	}

}
