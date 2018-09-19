import java.util.Scanner;

public class Main2557 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int count =0;
			
			
			int num = a*b*c;
			int[] freq = new int[10];
			
			int cnum = num;
			
			for (int i = 0; cnum != 0; i++) {
				cnum = cnum /10;
				count++;
			}
			
			for (int j = 0; j < count; j++) {
				
				
				for (int i = 0; i < 10; i++) {
					if(i == num %10)
					{
						freq[i]++;
						
					}
				}
				num = num/10;
			}
			
		
			
			
			
			for (int i = 0; i < 10; i++) {
				System.out.println(freq[i]);
			}
		}
}
