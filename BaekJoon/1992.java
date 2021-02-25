import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static int N, now;
	static int[][] video;
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[] args) throws Exception{
		N=Integer.parseInt(br.readLine());
		video=new int[N][N];
		
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			for(int j=0;j<str.length();j++) {
				video[i][j]=str.charAt(j);
			}
		}
		divide(0,0,N);
		bw.flush();bw.close();br.close();
	}

	
	public static void divide(int r, int c, int N) throws IOException  {
		if(check(r,c,N)) {
			bw.append(now-48+"");
		}else {
			bw.append("(");
			int l=N/2;
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					divide(r+l*i, c+l*j, l);
				}
			}
			bw.append(")");
		}
	}
	
	public static boolean check(int r, int c, int N) {
		int tmp=video[r][c];
		for(int i=r ; i<r+N ; i++) {
			for(int j=c ; j<c+N ; j++) {
				if(tmp!=video[i][j]) {
					return false;
				}
			}
		}
		now=tmp;
		return true;
	}
}
