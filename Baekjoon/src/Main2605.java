import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main2605 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> line = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 1; i <= N; i++) {
			line.add(Integer.parseInt(st.nextToken()), i);
		}
	
		for (int i = N-1; i >= 0; i--) {
			System.out.print(line.get(i) + " ");
		}
	}
	

}
