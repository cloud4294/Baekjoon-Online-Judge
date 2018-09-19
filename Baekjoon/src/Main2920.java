import java.util.Scanner;

public class Main2920 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] num = new int[8];
			int flag = 0;
			
			for (int i = 0; i < 8; i++) {
				num[i] = sc.nextInt();
				if(num[i]>8) {
					return;
				}
			}
			
			
			for (int i = 0; i < 7; i++) {
				if(num[i]-num[i+1] == -1) {
					flag++;
				}
				else if(num[i] - num[i+1] == 1) {
					flag--;
				}
				
			}
			
			if(flag ==7) {
				System.out.println("ascending");
			}else if(flag ==-7) {
				System.out.println("descending");
			}else {
				System.out.println("mixed");
			}
			
		}
}
