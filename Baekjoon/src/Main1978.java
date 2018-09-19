import java.util.Scanner;

public class Main1978 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int[] input = new int[num];
			int count = 0;
			
			for (int i = 0; i < input.length; i++) {
				input[i] = sc.nextInt();
			}
			
			for (int i = 0; i < input.length; i++) {
				int flag =0;
				for (int j = 1; j < input[i]; j++) {
					if(input[i]% j ==0)
					{
						flag++;
					}
				}
				if(flag == 1)
				{
					count++;
				}
			}
			
			System.out.println(count);
		}
}
