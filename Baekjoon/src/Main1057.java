import java.util.Scanner;

public class Main1057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int round = sc.nextInt();
		int[] roundnum = new int[round+1];
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		int count = 1;
		int temp = 2;
		int result = 1;
		for (int j = 1; j <= round; j++) {
			roundnum[j] = count;
			if(j % temp == 0) {
				count++;
			}
		}
		
		
		while(true) {
			if(roundnum[p1] == roundnum[p2]){
				System.out.println(result);
				break;
			}else {
				count = 1;
				temp *= 2;
				result++;
				for (int j = 1; j <= round; j++) {
					roundnum[j] = count;
					if(j % temp == 0) {
						count++;
					}
				}
			}
			
			
			
		}
		
	}

}
