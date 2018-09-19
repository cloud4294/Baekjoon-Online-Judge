import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main6591 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new  OutputStreamWriter(System.out));
		List<Long> output = new ArrayList<Long>();
		while(true)  {
			String[] input = br.readLine().split(" ");
			long a = Long.parseLong(input[0]);
			long b = Long.parseLong(input[1]);
			int div = 1;
			long ans = 1;
			
			if(a == 0 && b == 0) {
				break;
			}
			if(a - b < b) {
				b = a - b;
			}
			while(b-- >0) {
				ans *= a--;
				ans /= div++;
			}
			output.add(ans);
			
			
		}
		for(long out:output) {
			bw.write(Long.toString(out) +"\n");
			bw.flush();
		}
		
		bw.close();
		
	}

}
