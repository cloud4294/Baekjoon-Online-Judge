import java.util.Scanner;

public class Main9251 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input1 = "0"+sc.next();
		String input2 = "0"+sc.next();
		int[][] count = new int[input1.length()][input2.length()];
		
		for (int i = 1; i < input1.length(); i++) {
			for (int j = 1; j < input2.length(); j++) {
				if((input1.charAt(i) == input2.charAt(j))){
					count[i][j] = count[i-1][j-1] + 1;
				}else {
					count[i][j] = Math.max(count[i-1][j], count[i][j-1]);
				}
			}
		}
		System.out.println(count[input1.length()-1][input2.length()-1]);
	}

}
