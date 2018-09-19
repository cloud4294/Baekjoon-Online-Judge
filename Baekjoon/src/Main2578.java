import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2578 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] bingo = new int[5][5];
		for (int i = 0; i < 5; i++) {
			String[] input = br.readLine().split(" ");
			for (int j = 0; j < 5; j++) {
				bingo[i][j] = Integer.parseInt(input[j]);
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(bingo[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
