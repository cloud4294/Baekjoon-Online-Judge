import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main11004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		List<Long> data = new ArrayList<Long>();
		for (int i = 0; i < N; i++) {
			data.add(sc.nextLong());
		}
		data.sort(null);
		System.out.println(data.get((int) (K-1)));
	}

}
