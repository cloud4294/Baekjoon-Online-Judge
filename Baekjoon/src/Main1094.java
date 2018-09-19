import java.util.Scanner;

public class Main1094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int stick = 64;
		int sum = 0;
		int count = 0;
		while (true) {
			if (num == stick) {
				System.out.println(1);
				return;
			}
			stick /= 2;
			
			if (num >= stick + sum) {
				sum += stick;
				count++;
				
			}
			if (num == sum) {
				System.out.println(count);
				return;
			}
			

		}
		
	}

}
