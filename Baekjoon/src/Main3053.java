import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3053 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		double uArea = R * R * Math.PI;
		double tArea = (2 * R) * (2 * R) / 2;
		System.out.printf("%.6f\n", uArea);
		System.out.printf("%.6f", tArea);

	}

}
