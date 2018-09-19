import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main1026 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A.add(Integer.parseInt(st.nextToken()));
		}
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			B.add(Integer.parseInt(st2.nextToken()));
		}
		A.sort(null);
		B.sort(null);
		int output = 0;
		for (int i = 0; i < N; i++) {
			output += A.get(i) * B.get(N-i-1);
		}
		
		System.out.println(output);
	}

}
