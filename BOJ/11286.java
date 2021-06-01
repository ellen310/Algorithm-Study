import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int n=Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				if(Math.abs(o1)==Math.abs(o2)) {
					return o1-o2; //절댓값이 같으면 그냥 오름차순(작은게 앞으로 감)
				}else if(Math.abs(o1)>Math.abs(o2)) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		
		
		for(int i=0;i<n;i++) {
			int x=Integer.parseInt(br.readLine());
			if(x!=0) pq.add(x); 
			if(x==0) {
				if(pq.isEmpty()) bw.append(0+"\n");
				else bw.append(pq.poll()+"\n");
			}
		}
		
		bw.flush();bw.close();br.close();
	}

}
