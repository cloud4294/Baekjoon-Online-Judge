import java.util.Scanner;

public class Main1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int sum = 0;
		if (N % 2 == 0 && L == 2) {
			L = 3;
		}
		for (int i = L; i <= 100; i++) {
			int K, C;
			if (i % 2 == 0) {
				K = N / i;
				if (N % i != i / 2)
					continue;
				C = K - (i - 1) / 2;
			} else {
				K = N / i;
				if (N % i != 0)
					continue;
				C = K - i / 2;
			}
			if(C >= 0) {
				for (int j = 0; j < i; j++) {
					System.out.print(C+j+" ");
				}
				return;
			}else break;
		}

		System.out.println(-1);
	}

}
