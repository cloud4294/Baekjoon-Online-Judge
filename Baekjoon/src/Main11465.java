import java.util.ArrayList;
import java.util.Scanner;

public class Main11465 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<String>();
		while(true) {
			input.add(sc.nextLine());
			if((input.get(input.size()-1)).equals("END")) {
				input.remove((input.get(input.size()-1)));
				break;
			}
		}
		for (int i = 0; i < input.size(); i++) {
			for (int j = (input.get(i)).length()-1; j >= 0; j--) {
				System.out.print(input.get(i).charAt(j));
			}
			System.out.println();
		}
	}

}
