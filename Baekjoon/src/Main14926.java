import java.util.Scanner;

public class Main14926 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int value = 0;
		int lim = num;
		int[] output = new int[num*2];
		for (int i = 0; i < num*2; i++) {
			if(value <= lim)
				output[i] = value++;
			else {
				lim--;
				value = 0;
			}
				
		}
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]+ " ");
		}
		
		
	}

}
