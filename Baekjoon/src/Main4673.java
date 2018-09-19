import java.util.Scanner;

public class Main4673 {
	
		public static int generate(int a) {
			int[] num = new int[4];
			
			   num[0] = a / 1000;
			   num[1]= (a / 100) % 10;
			   num[2]= (a /10) %10;
			   num[3]= a % 10;
	
			   a +=  num[0] + num[1] + num[2]+ num[3];
			   
			
			return a;
		}
	
	
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int[] ge = new int[10000];
			int count = 0;
			
			
			for (int i = 0; i < 10000; i++) {
				
				ge[i] = generate(i);
			}
				
			for (int i = 0; i < ge.length; i++) {
				
				
				count = 0;
				for (int j = 0; j < ge.length; j++) {
					
					if (i == ge[j]) {
						count++;
					}
				}
				if(count == 0)
					System.out.println(i);
				
				
				
			}
			
				
		}
}
