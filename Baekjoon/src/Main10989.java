import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader inputbuffer = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(inputbuffer.readLine());
		int[] input = new int[num+1];
		int max = 0;
		for (int i = 1; i <= num; i++) {
			input[i] = Integer.parseInt(inputbuffer.readLine());
			if(input[i] > max) {
				max = input[i];
			}
		}
		int[] count = new int[max+1];
		for (int i = 1; i <= num; i++) {
			count[input[i]]++;
		}
		int addnum = 0;
		for (int i = 1; i <= max; i++) {
			int temp = count[i];
			addnum += temp;
			count[i] = addnum;
		}
		
		int[] output = new int[num+1];
		StringBuffer sb = new StringBuffer();

		for (int i = num; i >= 0; i--) {
			output[count[input[i]]] = input[i];
			count[input[i]]--;
		}
		
		for (int i = 1; i < output.length; i++) {
			sb.append(output[i]+"\n");
		}
		System.out.println(sb);
	}

}
