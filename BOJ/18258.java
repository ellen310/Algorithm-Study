import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		Deque<Integer> queue = new ArrayDeque<>();
		
		for(int i=0; i<n ;i++) {
			st = new StringTokenizer( br.readLine() );
			String order=st.nextToken();
			
			switch(order) {
			case "push":
				queue.offer(Integer.parseInt(st.nextToken()));
				break;
			case "pop": 
				bw.append(queue.isEmpty()?"-1\n":queue.poll() + "\n" );
				break;
			case "size":
				bw.append(queue.size() + "\n" );
				break;
			case "empty":
				bw.append(queue.isEmpty()?"1\n":"0\n");
				break;
			case "front":
				bw.append(queue.isEmpty()?"-1\n":queue.peek()+"\n");
				break;
			case "back":
				bw.append(queue.isEmpty()?"-1\n":queue.peekLast()+ "\n");
				break;
			}
		}

		br.close();
		bw.close();
	}

}
