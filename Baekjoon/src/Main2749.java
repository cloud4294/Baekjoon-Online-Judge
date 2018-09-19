import java.util.Scanner;

public class Main2749 {
		static long[][] f = new long[2][2];
		static long[][] a = new long[2][2];
		static long[][] b = new long[2][2];
		static long[][] c = new long[2][2];
		
		
		static void mul(long x[][],  long y[][]) {
			a[0][0] = x[0][0]; a[0][1] = x[0][1];
			a[1][0] = x[1][0]; a[1][1] = x[1][1];
			b[0][0] = y[0][0]; b[0][1] = y[0][1];
			b[1][0] = y[1][0]; b[1][1] = y[1][1];
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					c[i][j] = (a[i][0] * b[0][j] + a[i][1] * b[1][j]) % 1000000;
				}
			}
		}
		
		static void fibo(long x) {
			if (x == 1) {
				c[0][0] = 1; c[0][1] = 1;
				c[1][0] = 1; c[1][1] = 0;
				return;
			}
			if (x % 2 == 0) {
				fibo(x / 2);
				mul(c, c);
			}
			else {
				fibo(x / 2);
				mul(c, c);
				mul(c, f);
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f[0][0] = 1;
		f[0][1] = 1;
		f[1][0] = 1;
		f[1][1] = 0;
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		if(num == 1) {
			System.out.println(1);
			return;
		}
		fibo(num-1);
		System.out.println(c[0][0]);
		
	}

}
