import java.util.Scanner;

public class Main9461 {
	static long[] tri = new long[101];

	static long dp(int n) {
		if (n < 5) {
			return tri[n];
		}
		else {
			
			for (int i = 6; i <= n; i++) {
				tri[i] = tri[i-1] + tri[i-5];
			}
			return tri[n];
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long[] output = new long[num];
		tri[1] = 1;
		tri[2] = 1;
		tri[3] = 1;
		tri[4] = 2;
		tri[5] = 2;

		for (int i = 0; i < num; i++) {
			int n = sc.nextInt();
			output[i] = dp(n);
		}
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
