import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		int N=Integer.parseInt(br.readLine());
		
		bw.append((int)(Math.pow(2, N)-1)+"\n");
		hanoi(N,1,2,3);
		bw.flush();
	}
	
	public static void hanoi(int N, int A, int B, int C) throws IOException {
		if(N==1) {
			bw.append(A+" "+C+"\n");
			return;
		}
		
		hanoi(N-1,A,C,B);
		bw.append(A+" "+C+"\n");
		hanoi(N-1,B,A,C);
	}

}
