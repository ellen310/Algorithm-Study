import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int N, now;
	static int[][] paper;
	static int[] cnt=new int[3];
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[] args) throws Exception{
		N=Integer.parseInt(br.readLine());
		paper=new int[N][N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				paper[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		divide(0,0,N);
		for(int item : cnt) {
			bw.append(item+"\n");
		}
		
	
		bw.flush();bw.close();br.close();
	}

	
	public static void divide(int r, int c, int N) throws IOException  {
		if(check(r,c,N)) {
			if(now==-1) cnt[0]++;
			else if(now==0) cnt[1]++;
			else if(now==1) cnt[2]++;
		}else {
			int l=N/3;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					divide(r+l*i, c+l*j, l);
				}
			}
		}
	}
	
	public static boolean check(int r, int c, int N) {
		int tmp=paper[r][c];
		for(int i=r ; i<r+N ; i++) {
			for(int j=c ; j<c+N ; j++) {
				if(tmp!=paper[i][j]) {
					return false;
				}
			}
		}
		now=tmp;
		return true;
	}
}
