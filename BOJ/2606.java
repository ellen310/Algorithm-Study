import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int computer[][]=new int[101][101];
	static boolean visited[]=new boolean[101];
	static int cnt;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int comCnt=Integer.parseInt(br.readLine());
		int net=Integer.parseInt(br.readLine());
		cnt=0;
		
		for(int i=1;i<=net;i++) {
			st=new StringTokenizer(br.readLine());
			int r=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			computer[r][c]=1;
			computer[c][r]=1;
		}
		
		DFS(1, comCnt);
		bw.append(cnt-1+"");
		bw.flush();br.close();bw.close();
		
	}

	static void DFS(int start, int depth) {
		cnt++;
		visited[start]=true;
		for(int i=1;i<=depth;i++) {
			if(!visited[i] && computer[start][i]==1) { 
				DFS(i,depth);
			}
		}
	}
}
