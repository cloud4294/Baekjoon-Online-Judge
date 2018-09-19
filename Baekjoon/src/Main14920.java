import java.util.Scanner;

public class Main14920 {
	
	
	

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 1;
		
		while(true) {
			
			if(num == 1) {
				System.out.println(n);
				break;
			}
			if(num % 2 == 0) {
				num = num / 2;
				n++;
			}
			else {
				num = 3 * num + 1;
				n++;
			}
			
			
		}
		

	}

}
