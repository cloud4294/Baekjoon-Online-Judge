import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> deque = new ArrayList<Integer>();
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			String command = sc.next();
			if (command.equals("push_front")) {
				int add = sc.nextInt();
				deque.add(0, add);
			} else if (command.equals("push_back")) {
				int add = sc.nextInt();
				deque.add(add);
			} else if (command.equals("pop_front")) {
				if (!deque.isEmpty()) {
					System.out.println(deque.get(0));
					deque.remove(0);
				} else {
					System.out.println(-1);
				}
			} else if (command.equals("pop_back")) {
				if (!deque.isEmpty()) {
					System.out.println(deque.get(deque.size() - 1));
					deque.remove(deque.size() - 1);
				} else {
					System.out.println(-1);
				}
			} else if (command.equals("size")) {
				System.out.println(deque.size());
			} else if (command.equals("empty")) {
				if (deque.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (command.equals("front")) {
				if (!deque.isEmpty()) {
					System.out.println(deque.get(0));
				} else {
					System.out.println(-1);
				}
			} else if (command.equals("back")) {
				if (!deque.isEmpty()) {
					System.out.println(deque.get(deque.size() - 1));
				} else {
					System.out.println(-1);
				}
			}
		}
	}
}
