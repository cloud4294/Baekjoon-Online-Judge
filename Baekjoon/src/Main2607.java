import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main2607 {

	static int length;
	static int[] count;

	public static HashMap<Character, Integer> origin, other;

	public static boolean similar(HashMap<Character, Integer> other) {
		int a, b, diff = 0, originLen = 0, otherLen = 0;
		for (char i = 'A'; i <= 'Z'; i++) {
			originLen += (a = origin.get(i));
			otherLen += (b = other.get(i));
			diff += Math.abs(a - b);
		}

		return diff <= 2 && Math.abs(originLen - otherLen) <= 1;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] data = new String[N];
		for (int i = 0; i < N; i++) {
			data[i] = br.readLine();
		}
		origin = new HashMap<>();
		other = new HashMap<>();
		int cnt = 0;

		for (char i = 'A'; i <= 'Z'; i++) {
			origin.put(i, 0);
		}
		for (int i = 0; i < data[0].length(); i++) {
			origin.replace(data[0].charAt(i), origin.get(data[0].charAt(i)) + 1);
		}

		for (int i = 1; i < N; i++) {
			for (char j = 'A'; j <= 'Z'; j++) {
				other.put(j, 0);
			}
			for (int j = 0; j < data[i].length(); j++) {
				other.replace(data[i].charAt(j), other.get(data[i].charAt(j)) + 1);
			}
			if(similar(other)) cnt++;
		}
		System.out.println(cnt);

	}

}
