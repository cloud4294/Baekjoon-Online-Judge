import java.util.Scanner;

public class Main13699 {
	
	
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			if(num >=0 && num <=35) {
				
			long[] jumhwa = new long[num+1];
				
		
			jumhwa[0] = 1;
				
					for (int i = 1; i <= num; i++) {
						for (int j = 0; j < i; j++) {
							jumhwa[i] += jumhwa[j] * jumhwa[i - j - 1];
						}
						
					}
				
			System.out.println(jumhwa[num]);	
				
		
			}
			
			
		}
}
