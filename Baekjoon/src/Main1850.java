import java.util.Scanner;

public class Main1850 {

	static long gcd(long a, long b) {
		if (b == 0)
			return a;

		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
	
		
		for (long i = 0; i < gcd(a, b); i++) {
			System.out.print("1");
		}
		

	}

}
