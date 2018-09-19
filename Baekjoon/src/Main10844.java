import java.util.Scanner;

public class Main10844 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long[][] output = new long[num+1][10];
		long out = 0;
		output[1][0] = 0;
		output[1][1] = 1;
		output[1][2] = 1;
		output[1][3] = 1;
		output[1][4] = 1;
		output[1][5] = 1;
		output[1][6] = 1;
		output[1][7] = 1;
		output[1][8] = 1;
		output[1][9] = 1;
		for (int j = 2; j <= num; j++) {
			for (int i = 0; i <= 9; i++) {
				if (i == 0) {
					output[j][i] += output[j - 1][i + 1] % 1000000000;
				} else if (i == 9) {
					output[j][i] += output[j - 1][i - 1] % 1000000000;
				} else {
					output[j][i] += (output[j - 1][i - 1] + output[j - 1][i + 1]) % 1000000000;
				}
			}
		}
		if (num == 1) {
			System.out.println(9);
		} else {
			for (int i = 0; i <= 9; i++) {
				out += output[num][i];
				out = out % 1000000000;
			}
			System.out.println(out);
		}

	}

}
