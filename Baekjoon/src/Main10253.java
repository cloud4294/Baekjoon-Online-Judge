import java.util.Scanner;

public class Main10253 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			double sum = a / b;
			double max = 0;

			for (int j = 1; j <= b; j++) {
				if (1 / j <= sum ) {
					max = i / j;
					System.out.println(max);
					sum -= max;
				}
			}

		}
	}

}
