import java.util.Scanner;

public class Main2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] output = new int[num];
		
		
		for (int i = 0; i < num; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int sum = 0;

			int[][] apart = new int[k+1][n];

			for (int j = 0; j < n; j++) {
				apart[0][j] = j + 1;
			}

			for (int j = 0; j < k+1; j++) {
				for (int j2 = 0; j2 < n; j2++) {
					sum += apart[j][j2];
					if(j+1 <k+1)
						apart[j+1][j2] = sum;
				}
				sum =0;
			}
			
			output[i] = apart[k][n-1];

		}
		
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
