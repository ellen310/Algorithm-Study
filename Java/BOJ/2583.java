import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int M,N;
	static boolean visited[][];
	static int pos[][]= {{-1,0},{1,0},{0,-1},{0,1}}; //╩С,го,аб,©Л
	static int area=0;
	static int arr[]=new int[10001];
	static int cnt=0;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		visited=new boolean[M][N];
		Arrays.fill(arr, M*N);
		
		while(K-->0) {
			st=new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			
			for(int i=x1;i<x2;i++) {
				for(int j=y1;j<y2;j++) {
					visited[j][i]=true;
				}
			}
		}
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(!visited[i][j]) {
					area=0;
					DFS(i,j);
					cnt++;
					arr[cnt]=area;
					
				}
			}
		}
		
		Arrays.sort(arr);
		bw.append(cnt+"\n");
		for(int i=0;i<cnt;i++) {
			bw.append(arr[i]+" ");
		}
		bw.flush();bw.close();br.close();
	}
	
	public static void DFS(int r, int c) {
		visited[r][c]=true;
		area++;
		for(int i=0;i<pos.length;i++) {
			int newR = r + pos[i][0];
			int newC = c + pos[i][1];
			
			if(newR>=0&&newR<M &&newC>=0&&newC<N) { 
				if(!visited[newR][newC]) { 
					DFS(newR,newC);
				}
			}
		}
		
	}

}
