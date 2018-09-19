import java.util.Scanner;

public class Main2740 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] mat1 = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		 M = sc.nextInt();
		int K = sc.nextInt();
		int[][] mat2 = new int[M][K];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < K; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		int[][] result = new int[N][K];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				int temp = 0;
				for (int j2 = 0; j2 < M; j2++) {
					temp += mat1[i][j2] * mat2[j2][j];
				}
				result[i][j] = temp;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
