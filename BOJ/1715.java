import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int n=Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<n;i++) pq.add(Integer.parseInt(br.readLine()));
		
		int sum=0;
		long result=0;
		if(n==1) {
			bw.append(0+"");
		}else {
			while(true) {
				sum = pq.poll()+pq.poll();
				result+=sum;
				if(pq.isEmpty()) break;
				else pq.add(sum);
			}
			bw.append(result+"");
		}
		
		
		bw.flush();bw.close();br.close();
	}

}
