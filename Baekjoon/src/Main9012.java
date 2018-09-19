import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main9012 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			List<String> output = new ArrayList<String>();
			int num = sc.nextInt();
			for (int i = 0; i < num; i++) {
				int count = 0;
				List<Character> vps = new ArrayList<Character>();
				String line = sc.next();
				for (int j = 0; j < line.length(); j++) {
					if(line.charAt(j) == '(') {
						vps.add(line.charAt(j));
						count++;
						
					}else if(count > 0 && line.charAt(j) == ')') {
						if(vps.isEmpty() == false) {
							vps.remove(vps.size()-1);
							count--;
						}
					}else if(line.charAt(j) == ')') {
						count++;
					}
					
				}
				
				if(count > 0)
					output.add("NO");
				else
					output.add("YES");
			}
			
			for(String out:output) {
				System.out.println(out);
			}
	}

}
