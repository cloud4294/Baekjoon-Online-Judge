import java.util.Scanner;

public class Main2751 {
	public static int[] sort = new int[1000000];

	public static void MergeSort(int[] A, int p, int r) {

		int q;
		if (p < r) {

			q = (p + r) / 2;

			MergeSort(A, p, q);
			MergeSort(A, q + 1, r);
			Merge(A, p, q, r);
		}

	}

	public static void Merge(int[] A, int p, int q, int r) {
		int i, j, k, t;

		i = p;
		j = q + 1;
		k = p;

		while (i <= q && j <= r) {
			if (A[i] <= A[j]) {
				sort[k] = A[i++];
			} else {
				sort[k] = A[j++];
			}
			k++;

		}

		if (i > q) {
			for (t = j; t <= r; t++, k++) {
				sort[k] = A[t];
			}

		} else {
			for (t = i; t <= q; t++, k++) {
				sort[k] = A[t];
			}
		}
		
		for (t = p; t <= r; t++) {
			A[t] = sort[t];
		}

		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] input = new int[num];
		for (int i = 0; i < num; i++) {
			input[i] = sc.nextInt();
		}

		MergeSort(input, 0, num-1);

		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}

	}
}
