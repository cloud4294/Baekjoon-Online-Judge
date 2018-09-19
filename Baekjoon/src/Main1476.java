import java.util.Scanner;

public class Main1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		while(true) {
			if(E == S && E == M ) {
				break;
			}
			if(E <= S && E <=M) {
				E += 15;
			}else if(S <= E && S <= M) {
				S += 28;
			}else if(M <= S && M <= E) {
				M += 19;
			}
		
		}
		System.out.println(E);
		
	}

}
