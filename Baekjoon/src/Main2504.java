import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2504 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> output = new ArrayList<String>();
		int count = 0;
		int unitcount = 1;
		boolean putting = true;
		int flag = 0;
		
		List<Character> vps = new ArrayList<Character>();
		String line = sc.next();
		for (int j = 0; j < line.length(); j++) {
			if(line.charAt(j) == '(' ) {
				vps.add(line.charAt(j));
				unitcount *= 2;
				putting = true;
				flag++;
			}else if(line.charAt(j) == '[') {
				vps.add(line.charAt(j));
				unitcount *= 3;
				putting = true;
				flag++;
			}else if(line.charAt(j) == ')') {
				if(vps.isEmpty() == false) {
					if(vps.get(vps.size()-1) == '(') {
						vps.remove(vps.size()-1);
						if(putting == true) {
							count +=unitcount;
							putting = false;
						}
						unitcount /= 2;
					}else {
						System.out.println(0);
						return;
					}
					flag--;
				}
			}else if(line.charAt(j) == ']') {
				if(vps.isEmpty() == false) {
					if(vps.get(vps.size()-1) == '[') {
						vps.remove(vps.size()-1);
						if(putting == true) {
							count +=unitcount;
							putting = false;
						}
						unitcount /= 3;
					}else {
						System.out.println(0);
						return;
					}
				}
				flag--;
			}
			
		}
		if(flag ==0)
			System.out.println(count);
		else
			System.out.println(0);
	}

}
