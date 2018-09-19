import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main10597 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		List<String> data = new ArrayList<String>();
		
		
		String current = "";
		
		for (int i = 0; i < input.length(); i++) {
			current += input.substring(i, i+1);
			
			if(!data.contains(current)) {
				data.add(current);
				current = "";
			}
		}
		
		for (int i = 0; i < data.size(); i++) {
			System.out.print(data.get(i)+" ");
			
		}
		
	}

}
