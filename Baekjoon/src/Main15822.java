import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main15822 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[] X = br.readLine().split(" ");
		String[] Y = br.readLine().split(" ");
		int[] dataX = new int[X.length];
		int[] dataY = new int[Y.length];
		int height = 0;
		int indexX = 0;
		
		for (int i = 0; i < X.length; i++) {
			dataX[i] = Integer.parseInt(X[i]);
			dataY[i] = Integer.parseInt(Y[i]);
		}
		
		
		height += (dataX[0] - dataY[0]) * (dataX[0] - dataY[0]);
	
		
		for (int i = 1; i < Y.length; i++) {
			if((dataY[i]-dataX[indexX]) * (dataY[i]-dataX[indexX]) < (dataY[i]-dataX[indexX+1]) * (dataY[i]-dataX[indexX+1])) {
				height += (dataY[i]-dataX[indexX]) * (dataY[i]-dataX[indexX]);
				
			}else {
				height += (dataY[i]-dataX[indexX+1]) * (dataY[i]-dataX[indexX+1]);
				indexX++;
			}
			if(i == Y.length -1) {
				for (int j = indexX+1; j < dataX.length; j++) {
					
					height += (dataY[i]-dataX[j]) * (dataY[i]-dataX[j]);
				}
			}
		}
		System.out.println(height);
	}

}
