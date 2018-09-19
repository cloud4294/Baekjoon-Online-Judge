import java.util.Scanner;

public class Main2490 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			int count = 0;
			for (int j = 0; j < 4; j++) {
				count += a[i][j];
			}
			if(count == 1) {
				System.out.println("C");
			}else if(count == 2) {
				System.out.println("B");
			}else if(count == 3) {
				System.out.println("A");
			}else if(count == 4) {
				System.out.println("E");
			}else if(count == 0) {
				System.out.println("D");
			}
			
		}
	}

}
