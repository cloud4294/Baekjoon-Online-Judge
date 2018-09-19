import java.util.Scanner;

public class Main2455 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] in = new int[4];
		int[] out = new int[4];
		
		int man = 0;
		int max = 0;
		for (int i = 0; i < 4; i++) {
			out[i] = sc.nextInt();
			man -= out[i];
			in[i] = sc.nextInt();
			man += in[i];
			if(man > max) {
				max = man;
			}
		}
		System.out.println(max);
	}

}
