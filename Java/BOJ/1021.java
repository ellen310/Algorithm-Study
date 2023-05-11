import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());

		Deque<Integer> dq=new LinkedList<>();
		for(int i=1;i<=n;i++) dq.add(i);
		int cnt=0;
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<k;i++) {
			Object num=Integer.parseInt(st.nextToken());
			while(true) {
				int index=0; 
				Iterator it = dq.iterator();
				while (it.hasNext()) {
					if (it.next()==num) break;
					index++;
				}
				if(index==0) {
					dq.poll();
					break;
				}else if(index>dq.size()/2) {
					dq.addFirst(dq.removeLast());
					cnt++;
				}else {
					dq.addLast(dq.removeFirst());
					cnt++;
				}
			}
		}
		
		bw.append(cnt+"");
		bw.flush();bw.close();br.close();
		
	}

}
