import java.util.Scanner;

public class Main10219 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int i = 0; i < testcase; i++) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			char[][] grill = new char[row][col];
			for (int j = 0; j < row; j++) {
				String input = sc.next();
				for (int j2 = 0; j2 < col; j2++) {
					grill[j][j2]  = input.charAt(j2);
				}
			}
			for (int j = 0; j < row; j++) {
				for (int j2 = col -1; j2 >= 0; j2--) {
					System.out.print(grill[j][j2]);
				}
				System.out.println();
			}
		}
	}

}
