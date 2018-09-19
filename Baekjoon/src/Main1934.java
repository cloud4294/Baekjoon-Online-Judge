import java.util.Scanner;

public class Main1934 {

	static int gcd(int a,int b) {
		if(a%b ==0)
			return b;
		
		return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] output = new int[num];
		for (int i = 0; i < num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(b > a) {
				int temp = b;
				b = a;
				a = temp;
			}
			int result = a*b/gcd(a,b);
			output[i] = result;
		}
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
