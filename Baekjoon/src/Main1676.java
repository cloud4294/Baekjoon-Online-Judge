import java.util.Scanner;

public class Main1676 {
		static int count2 = 0;
		static int count5 = 0;
	static void fac(int num) {
		if(num == 1)	
			return;
		fac(num-1);
		while(num%2 ==0) {
			num /= 2;
			count2++;
		}
		while(num%5 ==0) {
			num /= 5;
			count5++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 0) {
			System.out.println(0);
			return;
		}
		fac(num);
		if(count2 > count5) {
			System.out.println(count5);
		}else {
			System.out.println(count2);
		}

	}
}
