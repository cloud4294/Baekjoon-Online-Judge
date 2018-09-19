import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] input = new int[N];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			input[i] = Integer.parseInt(br.readLine());
			sum += input[i];
			if(input[i] > max){
				max = input[i];
			}
		}
		Arrays.sort(input);
		int[] count = new int[8001];
		for (int i = 0; i < count.length; i++) {
			count[input[i]+4000]++;
		}

		System.out.println(sum / N);
		System.out.println(input[input.length / 2 + 1]);

		System.out.println(input[input.length - 1] - input[0]);

	}

}
