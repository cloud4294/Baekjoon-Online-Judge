import java.util.Scanner;

public class Main1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int[] count = new int[10];
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '0') {
				count[0]++;
			}else if(input.charAt(i) == '1'){
				count[1]++;
			}else if(input.charAt(i) == '2'){
				count[2]++;
			}else if(input.charAt(i) == '3'){
				count[3]++;
			}else if(input.charAt(i) == '4'){
				count[4]++;
			}else if(input.charAt(i) == '5'){
				count[5]++;
			}else if(input.charAt(i) == '6'){
				count[9]++;
			}else if(input.charAt(i) == '7'){
				count[7]++;
			}else if(input.charAt(i) == '8'){
				count[8]++;
			}else if(input.charAt(i) == '9'){
				count[9]++;
			}
		}
		int max = 0;
		count[9] = (int) Math.round(count[9] / 2.0);
		for (int i = 0; i < count.length; i++) {
			
			if(count[i] > max) {
				max = count[i];
			}
		}
		System.out.println(max);
	}
}
