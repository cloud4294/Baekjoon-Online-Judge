import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main9663 {
	
	static int N;
	static int[] cols;
	static int count = 0;
	
	public static boolean promising(int level) {
		for (int i = 1; i < level; i++) {
			if(cols[i] == cols[level])
				return false;
			else if(level - i == Math.abs(cols[level] - cols[i]))
				return false;
		}
		return true;
	}
	
	public static boolean queens(int level) {
		if(!promising(level))
			return false;
		else if(level == N) {
			count++;
			return true;
		}
		for (int i = 1; i <= N; i++) {
			cols[level+1] = i;
			queens(level+1);	
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		cols = new int[N+1];
		queens(0);
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		
	}

}
