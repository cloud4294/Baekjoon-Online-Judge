import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14729 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] data = new int[100001]; 
		for (int i = 0; i < N; i++) {
			double current = Double.parseDouble(br.readLine());
			double temp = current * 1000.0;
			data[(int)temp]++;
		}
		int count = 0;
		for (int i = 0; i <= 100000; i++) {
			while(data[i] > 0) {
				data[i]--;
				count++;
				System.out.printf("%d.%03d\n",i /1000, i % 1000);
				if(count == 7)
					return;
			}
		}
		
		
	}

}
