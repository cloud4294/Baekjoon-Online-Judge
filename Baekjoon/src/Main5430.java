import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main5430 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];
		for (int i = 0; i < T; i++) {
			String com = br.readLine();
			boolean vec = true;
			boolean error = false;
			int size = Integer.parseInt(br.readLine());
			int start = 0;
			int end = size - 1;
			String input = br.readLine();
			input = input.substring(1, input.length() - 1);
			String[] data = input.split("\\,");
			StringBuilder builder = new StringBuilder();

			for (int j = 0; j < com.length(); j++) {
				if (com.charAt(j) == 'R' && vec == true) {
					vec = false;
				} else if (com.charAt(j) == 'R' && vec == false) {
					vec = true;
				} else if (com.charAt(j) == 'D' && vec == true) {
					if (start > end) {
						builder.append("error");
						error = true;
						break;
					}
					start++;
				} else if (com.charAt(j) == 'D' && vec == false) {
					if (start > end) {
						builder.append("error");
						error = true;
						break;
					}
					end--;
				}

			}
			if (error == false) {
				if (vec == true) {
					builder.append("[");
					for (int j = start; j <= end; j++) {
						builder.append(data[j]);
						if (j != end) {
							builder.append(",");
						}
					}
					builder.append("]");
				} else {
					builder.append("[");
					for (int j = end; j >= start; j--) {
						builder.append(data[j]);
						if (j != start) {
							builder.append(",");
						}
					}
					builder.append("]");
				}
			}

			result[i] = builder.toString();

		}

		for (int j = 0; j < result.length; j++) {
			bw.write(result[j] + "\n");
			bw.flush();
		}
		bw.close();
		br.close();
	}

}
