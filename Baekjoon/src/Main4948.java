import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main4948 {
	
	static boolean[] prime;
	
	public static int solve(int n) {
		int count = 0;
		for (int i = n+1; i <= 2*n; i++) {
			if(prime[i] == true)
				count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> input = new ArrayList<Integer>();
		int max = 0;
		
		while(true) {
			int temp = Integer.parseInt(br.readLine());
			if(temp == 0)
				break;
			else {
				input.add(temp);
				if(temp > max) {
					max = temp;
				}
			}
		}

		max *= 2;
		
		prime = new boolean[max+1];
		
		for (int i = 2; i <= max; i++) {
			prime[i] = true;
		}
		
		for (int i = 2; i <= max; i++) {
			for (int j = i * 2; j <= max; j+=i) {
					prime[j] = false;
			}
		}
		
		for(int out:input) {
			bw.write(Integer.toString(solve(out))+"\n");
			bw.flush();
		}
		bw.close();
	}

}
