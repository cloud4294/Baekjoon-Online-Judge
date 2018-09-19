import java.util.Scanner;

public class main1167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] node = new int[num+1][num+1];
		for (int i = 0; i < num; i++) {
			int x = sc.nextInt();
			while(true) {
				int y = sc.nextInt();
				if(y == -1) {
					break;
				}else {
					node[x][y] = sc.nextInt();
				}
			}
		}
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(node[i][j] +" ");
			}
			System.out.println();
		}
	}

}
