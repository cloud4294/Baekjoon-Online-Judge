import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


class Point{
	int x;
	int y;
	
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}


public class Main15923 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Point> queue = new LinkedList<Point>();
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			Point temp = new Point(x,y);
			queue.offer(temp);
		}
		
		int length = 0;
		
		Point start = queue.poll();
		Point first = start;
		
		while(!queue.isEmpty()) {
			Point dest = queue.poll();
			
			length += Math.sqrt((dest.x-start.x)*(dest.x-start.x) + (dest.y-start.y)*(dest.y-start.y));
			
			start = dest;
		}
		
		length += Math.sqrt((first.x-start.x)*(first.x-start.x) + (first.y-start.y)*(first.y-start.y));
		
		System.out.println(length);
	}

}
