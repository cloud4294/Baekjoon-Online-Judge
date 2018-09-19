import java.util.Scanner;

public class Main2609 {

	static long gcd(long a, long b) {
		if (a % b == 0)
			return b;

		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt();
		long b = sc.nextInt();
		if (b > a) {
			long temp = b;
			b = a;
			a = temp;
		}
		long result = gcd(a, b);
		long result2 = a * b / result;

		System.out.println(result);
		System.out.println(result2);

	}

}
