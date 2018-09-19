import java.util.Scanner;

public class Main14921 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] liq = new int[num];
		int result = 0;
		int min = 100000000;
		for (int i = 0; i < num; i++) {
			liq[i] = sc.nextInt();
		}
		
		for (int i = 0; i < liq.length / 2 ; i++) {
			result = liq[i] + liq[num - i-1];
			if(liq[i] == liq[num-i-1]) {
				continue;
			}
			if(result * result < min * min)
			{
				min = result;
			}
			
		}
		System.out.println(min);
	}

}
