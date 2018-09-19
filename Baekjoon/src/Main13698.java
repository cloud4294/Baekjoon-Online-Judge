import java.util.Scanner;

public class Main13698 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cup = new int[4];
		cup[0] = 1;
		cup[1] = 0;
		cup[2] = 0;
		cup[3] = 2;
		int temp = 0;
		
		String input = sc.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'A') {
				temp = cup[0];
				cup[0] = cup[1];
				cup[1] = temp;
			}
			else if(input.charAt(i) =='B') {
				temp = cup[0];
				cup[0] = cup[2];
				cup[2] = temp;
			}
			else if(input.charAt(i) =='C') {
				temp = cup[0];
				cup[0] = cup[3];
				cup[3] = temp;
			}
			else if(input.charAt(i) =='D') {
				temp = cup[1];
				cup[1] = cup[2];
				cup[2] = temp;
			}
			else if(input.charAt(i) =='E') {
				temp = cup[1];
				cup[1] = cup[3];
				cup[3] = temp;
			}
			else if(input.charAt(i) =='F') {
				temp = cup[2];
				cup[2] = cup[3];
				cup[3] = temp;
			}
			if(input.charAt(i) == '\n') {
				break;
			}
			
		}
			
			
		
		for (int j = 0; j < cup.length; j++) {
			if(cup[j] == 1) {
				System.out.println(j+1);
			}
		}
		for (int j = 0; j < cup.length; j++) {
			if(cup[j] == 2) {
				System.out.println(j+1);
			}
		}
		
		
		
	}

}
