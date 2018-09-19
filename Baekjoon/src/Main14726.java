import java.util.Scanner;

public class Main14726 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long[] luhn = new long[num];
		char[] valid = new char[num];
		for (int i = 0; i < num; i++) {
			luhn[i] = sc.nextLong();
		}

		for (int i = 0; i < num; i++) {
			long result = 0;
			for (int j = 0; j < 16; j++) {
				long sum = 0;
				if (j % 2 == 0) {
					sum +=luhn[i] %10;
				} else {
					
					sum = (luhn[i] % 10) * 2;
					if (sum >= 10) {
						long a = sum / 10;
						long b = sum % 10;
						sum = a + b;
						
					}
					
				}
				result += sum;
				luhn[i] = luhn[i] / 10;
			}
		
			if (result % 10 == 0) {
				valid[i] = 'T';
			}
			else {
				valid[i] = 'F';
			}
		}
		
		for (int i = 0; i < valid.length; i++) {
			System.out.println(valid[i]);
		}

	}
}
