import java.util.Scanner;

public class Main2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(num +" * "+i+" = "+i*num);
		}
	}

}