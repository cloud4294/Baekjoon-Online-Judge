import java.util.Scanner;

public class Main13241 {

	static long gcd(long a,long b) {
		if(a%b ==0)
			return b;
		
		return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			long a = sc.nextInt();
			long b = sc.nextInt();
			if(b > a) {
				long temp = b;
				b = a;
				a = temp;
			}
			long result = a*b/gcd(a,b);
			System.out.println(result);
		
	}

}
