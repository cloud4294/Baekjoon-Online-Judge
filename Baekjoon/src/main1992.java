import java.util.Scanner;

public class main1992 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] input = new String[num];
		char[][] mat = new char[num][num];
		for (int i = 0; i < num; i++) {
			input[i] = sc.next();
			for (int j = 0; j < num; j++) {
				mat[i][j] = input[i].charAt(j);
			}
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}

}
