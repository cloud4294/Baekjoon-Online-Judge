import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main13702 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[] data = new int[N];
			
			for (int i = 0; i < N; i++) {
				data[i] = Integer.parseInt(br.readLine());
			}
			
			int min = 0 ;
			int max = Integer.MAX_VALUE;
			int mid = 0;
			
			while(min <= max) {
				mid = (min + max) / 2;
				int count = 0;
				for (int i = 0; i < N; i++) {
					count += data[i] / mid;
				}
				if(mid != 0 && count >= K)
					min = mid + 1;
				else 
					max = mid - 1;
				
			}
			System.out.println(max == -1 ? 0 : max);
			

		}
}
