import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4307 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] output = new String[T];
		
		for (int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");
			int l = Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);
			int[] position = new int[k];
			for (int j = 0; j < k; j++) {
				position[j] = Integer.parseInt(br.readLine());
			}

			int min = 0;
			int max = 0;

			for (int j = 0; j < position.length; j++) {
				if (l - position[j] < position[j]) {
					if (l - position[j] > min) {
						min = l - position[j];
					}
					if (position[j] > max) {
						max = position[j];
					}
				} else {
					if (position[j] > min) {
						min = position[j];
					}
					if (l - position[j] > max) {
						max = l - position[j];
					}
				}
			}

			output[i] = min + " " + max;
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println(output[i]);
		}
	}

}
