
import java.util.Scanner;

public class Main11401 {

	static long p = 1000000007;
	static long[] fac = new long[4000001];
	static long[] inv = new long[4000001];

	public static long power(long x, long y) {
		long ret = 1;
		while (y > 0) {
			if (y % 2 != 0) {
				ret *= x;
				ret %= p;
			}
			x *= x;
			x %= p;
			y /= 2;

		}
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		fac[1] = 1;
		for (int i = 2; i <= 4000000; i++) {
			fac[i] = (fac[i - 1] * i) % p;
		}
		inv[4000000] = power(fac[4000000], p - 2);
		for (int i = 4000000-1; i > 0; i--) {
			inv[i] = (inv[i+1] *(i+1)) % p;
		}
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if(num1 == num2 || num2 == 0) {
			System.out.println(1);
			return;
		}
		
		long r = (fac[num1] * inv[num1-num2]) % p;
		r = (r * inv[ num2]) %p;
		System.out.println(r);
	}

}
