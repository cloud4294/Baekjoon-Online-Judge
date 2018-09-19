import java.util.Scanner;

public class Main2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] sort = new int[num];
		int key = 0;
		int k = 0;

		for (int i = 0; i < num; i++) {
			sort[i] = sc.nextInt();
		}

		for (int j = 1; j < sort.length; j++) {
			key = sort[j];
			k = j - 1;
			while (k > -1 && sort[k] < key) {
				sort[k + 1] = sort[k];
				k--;
				sort[k + 1] = key;

			}
		}

		for (int i = 0; i > sort.length; i++) {
			System.out.println(sort[i]);
		}

	}
}
