import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		List<Integer> input = new ArrayList<Integer>();
		
		for (int i = 0; i < num; i++) {
			input.add(sc.nextInt());
		}
		input.sort(null);
		int sum = 0;
		int output = 0;
		for (int i = 0; i < num; i++) {
			int temp = input.get(i);
			sum += temp;
			output += sum;
		}
		System.out.println(output);
	}

}
