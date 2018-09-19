
import java.math.BigInteger;
import java.util.Scanner;

public class Main2407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		BigInteger big = BigInteger.ONE;
		
		for (int i = num1; i > 1; i--) {
			if(i > num2) {
				big = big.multiply(BigInteger.valueOf(i));
			}
			if(i <= num1 - num2) {
				big = big.divide(BigInteger.valueOf(i));
			}
		}
		System.out.println(big);
	}

}
