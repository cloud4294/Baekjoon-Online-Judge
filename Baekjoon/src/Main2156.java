import java.util.Scanner;

public class Main2156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] scale = new int[num + 1];
		int[][] output = new int[num + 1][2];
		int max = 0;
		for (int i = 1; i <= num; i++) {
			scale[i] = sc.nextInt();
		}
		if (num == 1) {
			System.out.println(scale[1]);
			return;
		}
		output[1][0] = 0;
		output[1][1] = scale[1];
		output[2][0] = scale[1];
		output[2][1] = output[1][1] + scale[2];
		if (num == 2) {
			System.out.println(output[2][1]);
			return;
		}
		for (int i = 3; i <= num; i++) {
			output[i][0] = Math.max(output[i-1][1], output[i-2][1]);
			output[i][1] = Math.max(output[i-2][1] + scale[i], output[i-2][0] + scale[i-1] +  scale[i]);
			
		}

		System.out.println(Math.max(output[num-1][1], output[num][1]));
	}

}
