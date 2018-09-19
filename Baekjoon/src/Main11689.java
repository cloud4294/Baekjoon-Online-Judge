import java.util.Scanner;

public class Main11689 {

	public static long gcd(long num1, long num2) {
		if (num2 == 0)
			return num1;
		else
			return gcd(num2, num1 % num2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		int count = 0;
		
		for (long i = 1; i <= num; i++) {
			if(gcd(num,i) == 1) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
