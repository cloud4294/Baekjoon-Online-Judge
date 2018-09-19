import java.util.Scanner;

public class Main11052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] price = new int[N+1];
		for (int i = 1; i <= N; i++) {
			price[i] = sc.nextInt();
		}
		int[] output = new int[N+1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				output[i]  = Math.max(output[i], output[i-j]+price[j]);
			}
		}
		System.out.println(output[N]);
		
	}

}
