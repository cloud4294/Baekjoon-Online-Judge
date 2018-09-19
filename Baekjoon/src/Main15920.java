import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15920 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		boolean flag = false;
		boolean multi = false;
		int count = 0;
		for (int i = 0; i < N; i++) {
			char current = input.charAt(i);
			if (current == 'W')
				count++;
			else if (current == 'P') {
				if (count == 1) {
					multi = true;
				}

				if (flag == true)
					flag = false;
				else if (flag == false)
					flag = true;
			}
			if(count == 2)
				break;
			
		}
		if (count > 1) {
			if (multi == true) {
				System.out.println(6);
			} else if (flag == false) {
				System.out.println(5);
			} else if (flag == true) {
				System.out.println(1);
			}
		} else {
			System.out.println(0);
		}

	}

}
