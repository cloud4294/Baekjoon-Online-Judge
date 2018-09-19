import java.util.Scanner;

public class Main10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int output = 1;
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			output *= i;
		}
		System.out.println(output);
	}

}
