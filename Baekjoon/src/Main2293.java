import java.util.Scanner;

public class Main2293 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] coin = new int[n+1];
		int[] count = new int[k+1];
		for(int i=1; i<=n; i++){
			coin[i] = sc.nextInt();
		}
		sc.close();
		
		count[0] = 1;
		for(int i=1; i<=n; i++){ 
			for(int j=0; j<=k; j++){ 
				if(coin[i] <= j) {
					count[j]+=count[j-coin[i]];
				}
			}
		}
		System.out.println(count[k]);
	}

}
