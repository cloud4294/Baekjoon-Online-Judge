import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9655 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if(N % 2 == 1) {
			System.out.println("SK");
		}else {
			System.out.println("CY");
		}
	}

}
