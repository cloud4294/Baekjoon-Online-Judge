import java.util.Scanner;

public class Main1932 {

	static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] cost = new int[size][size];
		int[][] output = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j <= i; j++) {
				cost[i][j] = sc.nextInt();
			}
		}

		output[0][0] = cost[0][0];
		output[1][0] = output[0][0] + cost[1][0];
		output[1][1] = output[0][0] + cost[1][1];

		for (int i = 2; i < size; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					output[i][j] = output[i - 1][j] + cost[i][j];
				}else if(j == i) {
					output[i][j] = output[i - 1][i-1] + cost[i][j];
				}
				else {
					output[i][j] = max(output[i-1][j-1]+cost[i][j],output[i-1][j]+cost[i][j]);
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < output.length; i++) {
			if(output[size-1][i] > max) {
				max = output[size-1][i];
			}
		}
		System.out.println(max);
	}

}
