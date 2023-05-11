import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int N,M;
	static int map[][]=new int[1001][1001];
	static boolean visited[]= new boolean[1001];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int result=0;
		
		st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());

		while(M-->0) {
			st=new StringTokenizer(br.readLine());
			int n1=Integer.parseInt(st.nextToken());
			int n2=Integer.parseInt(st.nextToken());
			map[n1][n2]=1;
			map[n2][n1]=1;
		}
		
		for(int i=1;i<=N;i++) {
			if(!visited[i]) {
				DFS(i);
				result++;
			}
		}
		
		bw.append(result+"");
		bw.flush();bw.close();br.close();
	}
	
	public static void DFS(int num) {
		if(visited[num]) return;
		
		visited[num]=true;
		for(int i=1;i<=N;i++) {
			if(map[num][i]==1) DFS(i);
		}
	}

}
