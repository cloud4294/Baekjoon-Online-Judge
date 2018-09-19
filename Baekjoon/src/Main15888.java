import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15888 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int count1 = 0;
		int count2 = 0;

		for (int i = -100; i <= 100; i++) {
			if (A * i * i + B * i + C == 0) {
				count1++;
				for (int j = 2; j <= 64; j *=2) {
					if(j == i)
						count2++;
				}

			}

		}
		

		if (count1 != 2)
			System.out.println("둘다틀렸근");
		else if (count2 == 2)
			System.out.println("이수근");
		else
			System.out.println("정수근");

	}

}
