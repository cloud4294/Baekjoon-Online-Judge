import java.util.Scanner;

public class Main14730 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		int[] num2 = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
			num2[i] = sc.nextInt();
		}
		int result = 0;
		
		for (int i = 0; i < N; i++) {
			result += (num[i]*num2[i]);
		}
		
		System.out.println(result);
		
	}

}
