import java.util.Scanner;

public class Main6064 {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] output = new int[num];

		for (int i = 0; i < num; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int flag = 0;

			int outx = 0;
			int outy = 0;

		
			if(x > M || y > N) {
				output[i] = -1;
				break;
			}


			while(M*outx + x <= M*N){

				if (M * outx + x > N * outy + y) {
					outy++;
				} else if (M * outx + x < N * outy + y) {
					outx++;
				} else if (M * outx + x == N * outy + y) {
					output[i] = M * outx + x;
					flag = 1;
					break;
				}

				
				//System.out.println(outx + " " + outy);

			}
			if (flag == 0) {
				output[i] = -1;
			}

		}

		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}
}
