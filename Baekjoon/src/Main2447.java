import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main2447 {

	static char[][] output;

	static void star(int x, int y, int num) {
		if (num == 1) {
			output[x][y] = '*';
			return;
		} 
		
		int div = num / 3;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 1 && j == 1);
				else {
					star(x+(i*div),y+(j*div),div);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		output = new char[num][num];
		star(0, 0, num);
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(output[i][j] != '*') {
					output[i][j] = ' ';
					
				}
			}
		}

		for (int i = 0; i < num; i++) {
			
				System.out.println(output[i]);
			
			
		}
	}

}
