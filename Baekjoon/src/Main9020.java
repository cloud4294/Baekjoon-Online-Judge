import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main9020 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		int T = Integer.parseInt(br.readLine());
		boolean[] p = new boolean[10001];
		for (int i = 2; i <= 10000; i++) {
			p[i] = true;
		}
		List<Integer> prime = new ArrayList<Integer>();
		List<String> output = new ArrayList<String>();
		for (int i = 2; i <= 10000; i++) {
			for (int j = i * 2; j <= 10000; j+=i) {
				p[j] = false;
			}
		}
		for (int i = 2; i <= 10000; i++) {
			if(p[i] == true)
				prime.add(i);
		}
		
		for (int i = 0; i < T; i++) {
			int input = Integer.parseInt(br.readLine());
			int min = Integer.MAX_VALUE;
			int out1 = 0;
			int out2 = 0;
			for(int temp:prime) {
				if(temp > input - temp)
					break;
				else if(prime.contains(input - temp)) {
					if(input - 2*temp < min) {
						min = input - 2 * temp;
						out1 = temp;
						out2 = input - temp;
					}
				}
			}
			output.add(out1+" "+out2);
			
		}
		
		for(String out:output) {
			bw.write(out+"\n");
			bw.flush();
		}
		bw.close();
		 
	}

}
