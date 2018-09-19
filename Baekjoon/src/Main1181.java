import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

class word {
	public String name;
	public int length;
	public word(String name, int length) {
		this.name = name;
		this.length = length;
	}
	
	public static Comparator<word> Comparator = new Comparator<word>() {
		public int compare(word word1,word word2) {
			if(word1.length == word2.length) {
				return word1.name.compareTo(word2.name);
			}else {
				return word1.length-word2.length;
			}
		}
		
	};

}


public class Main1181 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		word[] data = new word[N];
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			data[i] = new word(input,input.length());
		}
		
		Arrays.sort(data, word.Comparator);
		
		for (int i = 0; i < data.length; i++) {
			if(i == 0) 
				bw.write(data[i].name+"\n");
			else if(!data[i].name.equals(data[i-1].name))
				bw.write(data[i].name+"\n");
			
			bw.flush();
		}
		bw.close();
	
	}

}
