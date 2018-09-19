import java.util.Scanner;

public class Main1463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] save = new int[num+1];
		if(num == 2 || num == 3) {
			System.out.println(1);	
			return;
			}else if(num == 1) {
				System.out.println(0);
				return;
			}
		save[1] = 0;
		save[2] = 1;
		save[3] = 1;
		for (int i = 4; i < save.length; i++) {
			save[i] = save[i-1];
			if(i % 3== 0) {
				if(save[i] > save[i/3]) {
					save[i] = save[i/3];
				}
			}else if(i % 2 ==0) {
				if(save[i] > save[i/2]) {
					save[i] = save[i/2];
				}
			}
			save[i]++;
			
		}
		
		System.out.println(save[num]);
	}


}
