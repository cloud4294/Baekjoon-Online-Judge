import java.util.Scanner;

public class Main1149 {

	static int min(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] cost = new int[num][3];
		int[][] mincost = new int[num][3];
		for (int i = 0; i < num; i++) {
			cost[i][0] = sc.nextInt();
			cost[i][1] = sc.nextInt();
			cost[i][2] = sc.nextInt();
		}
		mincost[0][0] = cost[0][0];
		mincost[0][1] = cost[0][1];
		mincost[0][2] = cost[0][2];
		
		for (int i = 1; i < num; i++) {
			mincost[i][0] = min(mincost[i-1][1]+cost[i][0],mincost[i-1][2]+cost[i][0]);
			mincost[i][1] = min(mincost[i-1][0]+cost[i][1],mincost[i-1][2]+cost[i][1]);
			mincost[i][2] = min(mincost[i-1][1]+cost[i][2],mincost[i-1][0]+cost[i][2]);
		}
		
		System.out.println(min(min(mincost[num-1][0],mincost[num-1][1]),mincost[num-1][2]));
	}

}
