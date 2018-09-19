import java.util.Scanner;

public class Main14922 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] A = new int[num];
		for (int i = 0; i < A.length; i++) {
			A[i]= sc.nextInt();
		}
		int min = 1000000;
		for (int i = 0; i < num; i++) {
			int avr = A[i];
			for (int j = i+1; j < num; j++) {
				avr = (avr + A[j]) / (j - i +1);
				if (avr < min) {
					min = avr;
					System.out.println(A[i] + " " + A[j] + " " + avr);
				}
			}
		}
		
		System.out.println(min);
		
	}

}
