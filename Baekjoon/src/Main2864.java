import java.util.Scanner;

public class Main2864 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		String A = sc.next();
		String B = sc.next();
		char[] MaxA = A.toCharArray();
		char[] MinA = A.toCharArray();
		char[] MaxB = B.toCharArray();
		char[] MinB = B.toCharArray();
		
		for (int i = 0; i < A.length(); i++) {
			if(A.charAt(i) == '5') {
				MaxA[i] = '6';
			}else if(A.charAt(i) == '6') {
				MinA[i] ='5';
			}
			
		}
		for (int i = 0; i < B.length(); i++) {
			if(B.charAt(i) == '5') {
				MaxB[i] = '6';
			}else if(B.charAt(i) == '6') {
				MinB[i] ='5';
			}
		}
		
		
		String MaxAA = new String(MaxA,0,MaxA.length);
		String MinAA = new String(MinA,0,MinA.length);
		String MaxBB = new String(MaxB,0,MaxB.length);
		String MinBB = new String(MinB,0,MinB.length);
		
		
		
		
		int maxAnum = Integer.parseInt(MaxAA);
		int minAnum = Integer.parseInt(MinAA);
		int maxBnum = Integer.parseInt(MaxBB);
		int minBnum = Integer.parseInt(MinBB);

		
		System.out.print(minAnum + minBnum +" ");
		System.out.print(maxAnum + maxBnum);
		
		
		
	
	
	}

}
