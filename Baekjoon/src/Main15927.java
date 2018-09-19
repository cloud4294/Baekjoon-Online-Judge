import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15927 {

	public static boolean findP(String input) {
		int i = 0;
		int j = input.length()-1;
		while(i < j) {
			if(input.charAt(i) != input.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
	
			if(findP(input)) {
				input = input.substring(1, input.length());
				if(findP(input)) {
					System.out.println(-1);
				}else {
					System.out.println(input.length());
				}
			}else {
				System.out.println(input.length());
				
			}
		
		
		
	}

}
