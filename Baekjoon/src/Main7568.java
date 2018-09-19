import java.util.Scanner;

public class Main7568 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		int[] y = new int[num + 1];
		int[] output = new int[num + 1];
		
		for (int i = 1; i <= num; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		for (int i = 1; i <= num; i++) {
			int count = 1;
			for (int j = 1; j <= num; j++) {
				if(x[j] > x[i] && y[j] > y[i]) {
					count++;
				}
			}
			output[i] = count;
		}
		for (int i = 1; i <= num; i++) {
			System.out.print(output[i]+" ");
		}
	}

}
