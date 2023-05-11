import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int F, S, G, U, D;
	static int arr[];
	static Queue<Integer> q=new LinkedList<Integer>();

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		F=Integer.parseInt(st.nextToken());
		S=Integer.parseInt(st.nextToken());
		G=Integer.parseInt(st.nextToken());
		U=Integer.parseInt(st.nextToken());
		D=Integer.parseInt(st.nextToken());
		
		arr=new int[F+1];
		q.add(S);
		arr[S]=1;
		
		int result=BFS();
		if(result==-1) bw.append("use the stairs");
		else bw.append(result+"");
		
		bw.flush();br.close();bw.close();
	}
	
	public static int BFS() {
		
		while(!q.isEmpty()) {
			int curF=q.poll();
			if(curF==G) return arr[curF]-1;
			
			if(1<=curF+U && curF+U<=F) { //U한 층이 범위내 && 방문X
				if(arr[curF+U]==0 ) { 
					arr[curF+U]=arr[curF]+1;
					q.add(curF+U);
				}
			}
			
			if(1<=curF-D && curF-D<=F) { //D한 층이 범위내 && 방문X
				if(arr[curF-D]==0 ) { 
					arr[curF-D]=arr[curF]+1;
					q.add(curF-D);
				}
			}
		}
		return -1;
	}

}
