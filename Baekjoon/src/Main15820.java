import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main15820 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] S = br.readLine().split(" ");
		int S1 = Integer.parseInt(S[0]);
		int S2 = Integer.parseInt(S[1]);
		boolean sample = true;
		boolean system = true;
		
		for (int i = 0; i < S1; i++) {
			String[] input = br.readLine().split(" ");
			if(!input[0].equals(input[1])) {
				sample = false;
			}
		}
		
		for (int i = 0; i < S2; i++) {
			String[] input = br.readLine().split(" ");
			if(!input[0].equals(input[1])) {
				system = false;
			}
		}
		
		if(sample == true && system == true) {
			bw.write("Accepted");
		}else if(sample == false) {
			bw.write("Wrong Answer");
		}else if(system == false) {
			bw.write("Why Wrong!!!");
		}
		bw.flush();
		bw.close();
	}
	
	

}
