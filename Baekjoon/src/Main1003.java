import java.util.Scanner;

public class Main1003 {	
	
	static int[][] count = new int[2][41];
	
	static void fibo(int n) {
		
		count[0][0] = 1;
		count[1][0] = 0;
		count[0][1] = 0;
		count[1][1] = 1;
		
		
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < 2; j++) {
				count[j][i] = count[j][i-2] + count[j][i-1];
			}
		}
		System.out.println(count[0][n] +" "+ count[1][n]);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int input = sc.nextInt();
			fibo(input);
		}
	
	
	}

}
