import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		String input = br.readLine();
		input = input.toUpperCase();
		int[] count = new int[26];
		for (int i = 0; i < input.length(); i++) {
			count[input.charAt(i)-65]++;
		}
		
		int max = 0;
		int output = 0;
		boolean t = true;
		for (int i = 0; i < count.length; i++) {
			if(count[i] > max) {
				max = count[i];
				t = true;
				output = i;
			}
			else if(count[i] == max) {
				t = false;
			}
		}
		if(t == false) {
			bw.write("?");
		}else {
			bw.write((char) (output+65));
		}
		
		bw.flush();
		bw.close();
	}

}
