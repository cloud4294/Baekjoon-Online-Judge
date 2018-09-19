import java.util.Scanner;

public class Main2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int output = N;
		
		for (int three = 0; three <= N; three++) {
			for (int five = 0; five <= N; five++) {
				sum = 3 * three +  5 * five;
				if(sum == N) {
					if(three+five<output ) {
						output = three+five;
					}
				}
				if(sum > N) break;
			}
		}
		if(output == N) {
			System.out.println(-1);
		}else {
			System.out.println(output);
		}
		
	}

}
