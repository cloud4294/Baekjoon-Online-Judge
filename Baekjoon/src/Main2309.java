import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> key = new ArrayList<Integer>();
		int[] num = new int[10];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		sum -= 100;
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (num[i] + num[j] == sum) {
					index1 = i;
					index2 = j;

				}
			}
		}

		for (int i = 0; i < 9; i++) {
			if (i != index1 && i != index2) {
				key.add(num[i]);
			}
		}

		key.sort(null);
		for (int out : key) {
			System.out.println(out);
		}

	}

}
