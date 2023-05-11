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
		PriorityQueue<Integer> desc=new PriorityQueue<>(Comparator.reverseOrder()); //여기서 뽑은애가 mid
		PriorityQueue<Integer> asc=new PriorityQueue<>();
		
		
		desc.add(Integer.parseInt(br.readLine()));
		bw.append(desc.peek()+"\n");
		
		for(int i=1;i<n;i++) {
			if(desc.size()==asc.size()) desc.add(Integer.parseInt(br.readLine()));
			else asc.add(Integer.parseInt(br.readLine()));
			
			if(desc.peek()>asc.peek()) {
				desc.add(asc.poll());
				asc.add(desc.poll());
			}
			
			bw.append(desc.peek()+"\n");
			
		}
		
		bw.flush(); bw.close();br.close(); //시간제한 때문에 flush를 맨끝에만 적어줬음.
	}

}
