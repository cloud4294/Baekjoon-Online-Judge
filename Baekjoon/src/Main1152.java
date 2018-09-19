import java.util.Scanner;

public class Main1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		String[] input = sc.nextLine().split(" ");
		if(input.length < 1000001)
		{
			
			for (int i = 0; i < input.length; i++) {
				
				if (!input[i].equals("")) {
					count++;
				}
				
			}
			
			
			System.out.println(count);
		}
		
	}
}
