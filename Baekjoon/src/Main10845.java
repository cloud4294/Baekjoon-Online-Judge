import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> stack = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
		String ac = sc.next();
		if(ac.equals("push")) {
			int innum = sc.nextInt();
			stack.add(innum);
			
		}else if(ac.equals("pop")) {
			int s = stack.size();
			if(s == 0) {
				System.out.println(-1);
			}
			else {
				System.out.println(stack.get(0));
				stack.remove(0);
			}
			
		}else if(ac.equals("size")) {
			System.out.println(stack.size());;
		}else if(ac.equals("empty")) {
			if(stack.size() == 0) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
			
		}else if(ac.equals("front")) {
			int s = stack.size();
			if(s == 0) {
				System.out.println(-1);
			}
			else {
				System.out.println(stack.get(0));
			}
		}else if(ac.equals("back")) {
			int s = stack.size();
			if(s == 0) {
				System.out.println(-1);
			}
			else {
				System.out.println(stack.get(s-1));
			}
		}


		}

	}	
}
