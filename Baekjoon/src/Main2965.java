import java.util.Scanner;

public class Main2965 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int count = 0;
		if(b - a == 1 && c - b == 1) {
			System.out.println(0);
			return;
		}
		
		if (b - a > c - b) {
			c = b - 1;
			count++;
			while (true) {
				if ( b - 1 == a || c - 1 == a) {
					break;
				}
				if (b > c) {
					b -= 2;
					count++;
				} else {
					c -= 2;
					count++;
				}
			}
		}else {
			a = b + 1;
			count++;
			while (true) {
				if (b + 1 == c || a + 1 == c) {
					break;
				}
				if (a > b) {
					b += 2;
					count++;
				} else {
					a += 2;
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
