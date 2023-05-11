import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int n=Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<n;i++) {
			int x=Integer.parseInt(br.readLine());
			pq.add(x); 
			
			if(x==0) { 
				bw.append(pq.poll()+"\n");
			}
		}
		
		bw.flush();bw.close();br.close();
	}

}
