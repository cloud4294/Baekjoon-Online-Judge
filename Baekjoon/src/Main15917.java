import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15917 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Q = Integer.parseInt(br.readLine());
		int[] output = new int[Q];
		for (int i = 0; i < Q; i++) {
			int current = Integer.parseInt(br.readLine());
			int check = current & -current;
			if(check == current) {
				output[i] = 1;
			}else {
				output[i] = 0;
			}
		}
		
		for (int i = 0; i < Q; i++) {
			System.out.println(output[i]);
		}
		
	}

}
