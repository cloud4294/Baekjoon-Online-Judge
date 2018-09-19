
import java.util.Scanner;
import java.util.Vector;

public class Main14646 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int manu = sc.nextInt();
		int[] manuset = new int[manu*2];
		Vector<Integer> v = new Vector<Integer>();
		int count = 0;
		int maxcount = 0;
		for (int i = 0; i < 2 * manu; i++) {
			manuset[i] = sc.nextInt();
			
		}
		for (int i = 0; i < manuset.length; i++) {
			int flag = 1;
			for (int j = 0; j < i; j++) {
				if (manuset[i] == manuset[j]) {
					flag = 0;
				} 
			}
			if (flag == 1) {
				count++;
				if(count >= maxcount) {
					maxcount = count;
					
				}
			} else if(flag == 0) {
				count--;			
			}
				

		}
		
			

		System.out.println(maxcount);
	}

}
