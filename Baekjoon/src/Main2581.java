import java.util.Scanner;

public class Main2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int min = sc.nextInt();
		int max = sc.nextInt();
		
		int count = 0;
		int sum = 0;
		int minvalue = 0;

		for (int i = min; i <= max; i++) {
			int flag = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					flag++;
				}
			}
			if (flag == 1) {
				count++;
				if (count == 1)
					minvalue = i;
				sum += i;
			}
		}
		if(minvalue ==0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(minvalue);
		}
		
		
	
	}

}
