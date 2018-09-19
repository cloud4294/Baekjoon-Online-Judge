import java.util.Scanner;

public class Main2579 {
	static int max(int a,int b) {
		if(a >b)
			return a;
		else
			return b;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] point = new int[num+1];
		int[][] output = new int[num+1][2];
		for (int i = 1; i < num+1; i++) {
			point[i] = sc.nextInt();
		}
		output[1][0] = output[1][1] = point[1];
		for (int i = 2; i <= num; i++) {
			output[i][0] = output[i-1][1] + point[i];
			output[i][1] = max(output[i-2][0],output[i-2][1]) + point[i];
		}
		if(output[num][1] > output[num][0])
			System.out.println(output[num][1]);
		else
			System.out.println(output[num][0]);
	}

}
