import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main15886 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		int count = 0;
		for (int i = 0; i < input.length()-1; i++) {
			if(input.charAt(i) == 'E' && input.charAt(i+1)== 'W')
				count++;
		}
		
		System.out.println(count);
	}

}
