import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		String input = br.readLine();
		for (int i = 0; i < N; i++) {
			char index = input.charAt(i);
			String add = Character.toString(index);
			sum += Integer.parseInt(add);
		}
		bw.write(Integer.toString(sum));
		bw.flush();
	}	

}
