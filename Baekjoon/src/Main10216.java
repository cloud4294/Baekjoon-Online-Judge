import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class g{
	
	int x;
	int y;
	int r;
	List<Integer> adj;
	
	g(int x,int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
		adj = new ArrayList<Integer>();
	}
}

public class Main10216 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			g[] data = new g[N];
			for (int j = 0; j < N; j++) {
				String[] input = br.readLine().split(" ");
				int x = Integer.parseInt(input[0]);
				int y = Integer.parseInt(input[1]);
				int r = Integer.parseInt(input[2]);
				data[j] = new g(x,y,r);
			}
			
		}
	}

}
