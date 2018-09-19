import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main2608 {

	public static int getNum(String input) {

		Stack<Integer> stack = new Stack<Integer>();

		for (int j = 0; j < input.length(); j++) {
			if (input.charAt(j) == 'I')
				stack.push(1);
			else if (input.charAt(j) == 'V')
				stack.push(5);
			else if (input.charAt(j) == 'X')
				stack.push(10);
			else if (input.charAt(j) == 'L')
				stack.push(50);
			else if (input.charAt(j) == 'C')
				stack.push(100);
			else if (input.charAt(j) == 'D')
				stack.push(500);
			else if (input.charAt(j) == 'M')
				stack.push(1000);
		}

		int pred = 0;

		int count = 0;
		while (!stack.isEmpty()) {
			int current = stack.pop();
			if (pred <= current) {
				count += current;
			} else {
				count -= current;
			}
			pred = current;
		}

		return count;
	}

	public static String getString(int num) {

		String output = "";

		if (num / 1000 > 0) {
			for (int i = 0; i < num / 1000; i++) {
				output += "M";
			}
		}
		num = num % 1000;
		if (num / 100 >= 5) {
			if(num / 100 == 9) {
				output += "CM";
			}else {
				output += "D";
				for (int i = 0; i < (num / 100) - 5; i++) {
					output += "C";
				}
			}
		}else {
			if(num / 100 == 4) {
				output += "CD";
			}else {
				for (int i = 0; i < (num / 100); i++) {
					output += "C";
				}
			}
		}
		num = num % 100;
		if (num / 10 >= 5) {
			if(num / 10 == 9) {
				output += "XC";
			}else {
				output += "L";
				for (int i = 0; i < (num / 10) - 5; i++) {
					output += "X";
				}
			}
		}else {
			if(num / 10 == 4) {
				output += "XL";
			}else {
				for (int i = 0; i < (num / 10); i++) {
					output += "X";
				}
			}
		}
		num = num % 10;
		if (num >= 5) {
			if(num == 9) {
				output += "IX";
			}else {
				output += "V";
				for (int i = 0; i < num - 5; i++) {
					output += "I";
				}
			}
		}else {
			if(num == 4) {
				output += "IV";
			}else {
				for (int i = 0; i < num; i++) {
					output += "I";
				}
			}
		}
		
		return output;

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		String input2 = br.readLine();

		int num1 = getNum(input1);
		int num2 = getNum(input2);

		System.out.println(num1 + num2);
		System.out.println(getString(num1+num2));
	}

}
