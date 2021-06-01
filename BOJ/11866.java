import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());

		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=1;i<=n;i++) q.add(i);
		
		Queue<Integer> result=new LinkedList<Integer>();
		
		while(!q.isEmpty()) {
			for(int i=0;i<k-1;i++) {
				q.add(q.poll());
			}
			result.add(q.poll());
		}
		
		String str=result.toString();
		
		bw.append("<"+str.substring(1, str.length()-1)+">");
		
		bw.flush();bw.close();br.close();
		
	}

}
