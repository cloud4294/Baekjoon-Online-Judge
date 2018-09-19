import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main1786 {

	public static int[] getPi(String p) {
		int m = p.length();
		int j = 0;
		int[] pi = new int[m];

		for (int i = 1; i < m; i++) {
			while (j > 0 && p.charAt(i) != p.charAt(j))
				j = pi[j - 1];
			if (p.charAt(i) == p.charAt(j))
				pi[i] = ++j;

		}
		return pi;

	}

	public static List<Integer> kmp(String T, String P) {
		List<Integer> ans = new ArrayList<Integer>();

		int[] pi = getPi(P);
		int n = T.length();
		int m = P.length();
		int j = 0;
		for (int i = 0; i < n; i++) {
			while (j > 0 && T.charAt(i) != P.charAt(j))
				j = pi[j - 1];
			if (T.charAt(i) == P.charAt(j)) {
				if (j == m - 1) {
					ans.add(i - m + 1);
					j = pi[j];
				} else
					j++;
			}
		}

		return ans;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String T = br.readLine();
		String P = br.readLine();
		List<Integer> matched = new ArrayList<Integer>();

		matched = kmp(T, P);
		System.out.println(matched.size());
		for (int i = 0; i < matched.size(); i++) {
			System.out.println(matched.get(i)+1);
		}
	}

}
