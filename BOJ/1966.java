import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T=Integer.parseInt(br.readLine());
		
		
		while(T-->0) {
			Queue<Integer> q=new LinkedList<>();
			Queue<Integer> index=new LinkedList<>();
			PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
			
			st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int k=Integer.parseInt(st.nextToken());
			int cnt=1;
			
			st=new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++) {
				int num=Integer.parseInt(st.nextToken());
				q.add(num);
				pq.add(num);
				
				if(i==k) index.add(1); //1이 나올때가 해당 숫자가 출력되는 때
				else index.add(0);
			}
			int max=pq.poll();
			
			while (!q.isEmpty()) {
				
				if (q.peek()==max) {
					q.poll();
					int in=index.poll();
					if(!pq.isEmpty()) max=pq.poll();
					
					if(in==1) {
						bw.append(cnt+"\n");
						bw.flush();
						break;
					}
					cnt++;
				}else {
					q.add(q.poll());
					index.add(index.poll());
				}
			}
		}
		
			bw.close();br.close();
	}

}
