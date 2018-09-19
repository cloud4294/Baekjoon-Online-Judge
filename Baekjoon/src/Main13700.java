import java.util.Scanner;

public class Main13700 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int S = sc.nextInt();
			int D = sc.nextInt();
			int F = sc.nextInt();
			int B = sc.nextInt();
			int K = sc.nextInt();
			int[] I = new int[K];
			int[] num = new int[N];
			for (int j = 0; j < I.length; j++) {
				I[j] = sc.nextInt();
			}
			for (int j = 0; j < num.length; j++) {
				num[j] = 0;
			}
			for (int i = 0; i < I.length; i++) {
				num[I[i]] = 1;
			}
			
			int p = S;
			int dest = D - p;
			int flag = 0;
			int count = 0;
			boolean loop = true;
			
			while(loop) {
				if(dest > 0) {
					
					if(dest > F) {
						for (int j = 0; j < I.length; j++) {
							if(num[p+F] == 1)
								flag += 1;
						}
						if(flag == 0) {
							p = p + F;
							count++;
							System.out.println(p);
						}
						else if(flag > 0) {
							for (int j = 0; j < I.length; j++) {
								if(p - B == I[j])
									flag += 1;
							}
							if(flag == 0) {
								p = p - B;
								count++;
							}
							flag =0;
						}
						flag =0;
					}
					
					else if (dest == F){
						for (int j = 0; j < I.length; j++) {
							if(p + F == I[j])
								flag += 1;
						}
						if(flag == 0) {
							p = p + F;
							count++;
							System.out.println(count);
							loop = false;
						}
						else {
							System.out.println("BUG FOUND");
							loop = false;
						}
						flag =0;
					}
					
				}
				else if(dest < 0) {
					if(dest < B) {
						for (int j = 0; j < I.length; j++) {
							if(p - B == I[j])
								flag += 1;
						}
						if(flag == 0) {
							p = p - B;
							count++;
						}
						flag =0;
					}
					
					else if (dest == B) {
						for (int j = 0; j < I.length; j++) {
							if(p - B == I[j])
								flag += 1;
						}
						if(flag == 0) {
							p = p - B;
							count++;
							System.out.println(count);
							loop = false;
						}
						else {
							System.out.println("BUG FOUND");
							loop = false;
						}
						flag =0;
					}
				}
			}
		
		}
}
