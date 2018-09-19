import java.util.Scanner;

public class Main1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = num;
		int length = 0;

		for (int i = 0; num != 0; i++) {
			num = num / 10;
			length++;
		}

		int[] sortnum = new int[length];

		for (int i = 0; i < sortnum.length; i++) {
			sortnum[i] = num2 % 10;
			num2 = num2 / 10;
		}

		int key = 0;
		int k = 0;

		for (int j = 1; j < sortnum.length; j++) {
			key = sortnum[j];
			k = j - 1;
			while (k > -1 && sortnum[k] < key) {
				sortnum[k + 1] = sortnum[k];
				k--;
				sortnum[k + 1] = key;

			}
		}

		for (int i = 0; i < sortnum.length; i++) {
			System.out.print(sortnum[i]);
		}
	}
}
