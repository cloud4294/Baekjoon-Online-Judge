import java.util.Scanner;

public class Main8958 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] score = new int[n] ;
			int du =0;
			String[] s = new String[n];
			
			for (int i = 0; i < n; i++) {
				s[i] = sc.next();
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < s[i].length(); j++) {
					if(s[i].charAt(j) == 'O') {
						du++;
						score[i] = score[i] + du;
					}else if(s[i].charAt(j)=='X'){
						du = 0;
					}
				}
				du =0;
				
			}
			
			for (int i = 0; i < n; i++) {
				System.out.println(score[i]);
			}
			
			
		}
}
