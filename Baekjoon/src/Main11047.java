import java.util.Scanner;

public class Main11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int coin = sc.nextInt();

		int[] coinworth = new int[num];

		for (int i = 0; i < num; i++) {
			coinworth[i] = sc.nextInt();
		}
		int count = 0;

		for (int i = num-1; i >= 0; i--) {
			while (true) {
				if (coin < coinworth[i]) {
					break;
				}
				coin -= coinworth[i];
				count++;

			}
		}

		System.out.println(count);

	}

}
