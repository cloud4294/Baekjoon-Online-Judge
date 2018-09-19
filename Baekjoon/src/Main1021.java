import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> circle = new ArrayList<Integer>();
		List<Integer> search = new ArrayList<Integer>();
		int size = sc.nextInt();
		int num = sc.nextInt();
		int count = 0;
		int outputnum = 0;
		for (int i = 1; i < size+1; i++) {
			circle.add(i);	
		}
		for (int i = 0; i < num; i++) {
			search.add(sc.nextInt());
		}
		while(true) {
			int index = circle.indexOf(search.get(0));
			if(circle.get(0) == search.get(0)) {
				if(!search.isEmpty() && !circle.isEmpty()) {
					search.remove(0);
					circle.remove(0);
					outputnum++;
					if(outputnum == num) {
						break;
					}
				}
				
			}else if(index <= circle.size()/2) {
				int temp = circle.get(0);
				circle.remove(0);
				circle.add(temp);
				count++;
			}
			else if(index > circle.size()/2) {
				int temp = circle.get(circle.size()-1);
				circle.remove(circle.size()-1);
				circle.add(0,temp);
				count++;
			}
		}
		
		
		System.out.println(count);
	}

}
