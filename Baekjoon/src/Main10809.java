import java.util.Scanner;

public class Main10809 {
		 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			char[] alpha= new char[s.length()];
			int flag =0;
			
			for (int i = 0; i < s.length(); i++) {
				    alpha[i] = s.charAt(i);
			}
			
			for (char i = 'a'; i <= 'z'; i++) {
				for (int j = 0; j < alpha.length; j++) {
					if(i == alpha[j]) {
						System.out.print(j + " ");
						flag++ ;
						break;
					}
				}
				if (flag == 0) {
					System.out.print(-1 + " ");
					
				}
				flag = 0;
			}
		}
}
