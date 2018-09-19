import java.util.Scanner;

public class Main1065 {
		 static int han(int num) {
			if(num < 100)
				return 1;
			else {
				int a = num / 100;
				int b = (num /10) %10;
				int c = num %10;
				int sub = a - b ;
				if(sub == b - c)
				{
					return 1;
				}else
					return 0;
			}
			
		}
	
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int count = 0;
			for (int i = 1; i <= num; i++) {
				count += han(i);
			}
			System.out.println(count);
			
		}
}
