import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15922 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String[] input = br.readLine().split(" ");

		int start = Integer.parseInt(input[0]);
		int end = Integer.parseInt(input[1]);
		
		int count = 0;

		for (int i = 1; i < N; i++) {
			input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			if(x >= start && y <= end) {
				continue;
			}
			else if(x <= end)
				end = y;
			else if(x > end) {
				count += x - end;
				end = y;
				
			}
			
		}
		System.out.println(end - start - count);
		
	}

}
