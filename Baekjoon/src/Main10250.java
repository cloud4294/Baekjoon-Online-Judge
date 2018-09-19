import java.util.Scanner;

public class Main10250 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			
			int[] doornum = new int[num];
			
			for (int i = 0; i < num; i++) {
				int h = sc.nextInt();
				int w = sc.nextInt();
				int customer =sc.nextInt();
				
				int frontnum =0;
				int backnum =0;
				
				doornum[i]=0;
				int k =0;
				
				
				frontnum = (customer % h);
				if(frontnum ==0) {
					frontnum = h;
				}
				
				while(h*k < customer) {
					
					backnum += 1;
					
					k++;
				}
				
				
				doornum[i] = frontnum * 100 +backnum;
				
			}
			
				for (int i = 0; i < doornum.length; i++) {
					System.out.println(doornum[i]);
				}
		}
}
