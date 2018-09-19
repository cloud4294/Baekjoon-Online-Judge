import java.util.Scanner;

public class Main2747 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		int count = 2;
		int output = 0;
		if(num == 1) {
			System.out.println(1);
			return;
		}
		if(num == 0) {
			System.out.println(0);
			return;
		}
		while(count <= num) {
			output = num1 + num2;
			if(count == num) {
				System.out.println(output);
			}else {
				num1 = num2;
				num2 = output;
			}
			count++;
		}
	}

}
