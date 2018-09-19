import java.util.Scanner;

public class Main1977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int j = 1;
		int sum = 0;
		int min = 10001;
		for (int i = M; i <= N; i++) {
			while (i == j * j || j * j < i) {
				if(i == j * j)
				{
					sum += i;
					if( min > i) {
						min = i;
					}
					break;
				}else if(i > j * j) {
					j++;
				}else {
					break;
				}
				
			}
		}
		if(sum == 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(sum);
		System.out.println(min);
	}

}
