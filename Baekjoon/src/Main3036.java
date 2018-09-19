import java.util.Scanner;

public class Main3036 {

	static int gcd(int a, int b) {
		if (b == 0)
			return a;

		return gcd(b, a % b);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] length = new int[num+1];
		for (int i = 1; i <= num; i++) {
			length[i] = sc.nextInt();
		}
		for (int i = 2; i <= num; i++) {
			if(length[1]%length[i] == 0) {
				System.out.println(length[1]/length[i] +"/1");
			}
			else {
				int gcdnum = gcd(length[1],length[i]);
				System.out.println(length[1]/gcdnum +"/"+ length[i]/gcdnum);
			}
		}
	}

}
