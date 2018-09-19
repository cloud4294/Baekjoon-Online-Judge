import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15889 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] position = new int[N];
		int[] power = new int[N];

		for (int i = 0; i < N; i++) {
			position[i] = Integer.parseInt(st.nextToken());
		}
		if (N == 1) {
			System.out.println("�Ǻ����, �ߴ������ ã���ʴϴ�");
			return;
		}

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N - 1; i++) {
			power[i] = Integer.parseInt(st.nextToken());
		}

		int max = power[0] + position[0];

		for (int i = 1; i < N - 1; i++) {
			if (max >= position[i]) {
				if (max < position[i] + power[i]) {
					max = position[i] + power[i];
				}
			}
		}

		if (max >= position[N - 1])
			System.out.println("�Ǻ����, �ߴ������ ã���ʴϴ�");
		else
			System.out.println("���� �� ���� �ʾ��� �� ����");

	}

}
