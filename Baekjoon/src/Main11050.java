import java.util.Scanner;

public class Main11050 {
		static int output = 0;
		
		static int fac(int input) {
			if(input == 0) {
				return 1;
			}
			
			if(input == 1) {
				return 1;
			}
			else return input * fac(input -1);
		}
		
		static void cal(int num1,int num2) {
			output = fac(num1)/(fac(num2) * fac(num1-num2));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		cal(num1,num2);
		System.out.println(output);
		
	}

}
