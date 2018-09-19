import java.util.Scanner;

public class Main1547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int ball = 1;
		int[] sorc = new int[M];
		int[] dest = new int[M];
		for (int i = 0; i < M; i++) {
			sorc[i] = sc.nextInt();
			dest[i] = sc.nextInt();
			if(sorc[i] == ball) {
				ball = dest[i];
			}else if(dest[i] == ball) {
				ball = sorc[i];
			}
		}
		System.out.println(ball);
	}

}
