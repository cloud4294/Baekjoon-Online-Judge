import java.util.Scanner;

public class Main3003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int king = sc.nextInt();
		int queen = sc.nextInt();
		int look = sc.nextInt();
		int bishop = sc.nextInt();
		int knight = sc.nextInt();
		int phone = sc.nextInt();
		int[] output = new int[6];
		output[0] = 1 - king;
		output[1] = 1 - queen;
		output[2] = 2 - look;
		output[3] = 2 - bishop;
		output[4] = 2 - knight;
		output[5] = 8 - phone;
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]+" ");
		}
		
	}

}
