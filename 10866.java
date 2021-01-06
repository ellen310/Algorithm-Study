import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Deque<Integer> d=new ArrayDeque<>();
		StringTokenizer st;

		
		for(int i=0;i<n;i++) {
			st= new StringTokenizer(br.readLine());
			String order=st.nextToken();
			
			switch(order) {
			case "push_front":
				d.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				d.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				System.out.println(d.isEmpty()?-1:d.pollFirst()); //요소 제거하고 다음것 출력
				break;
			case "pop_back":
				System.out.println(d.isEmpty()?-1:d.pollLast());
				break;
			case "size":
				System.out.println(d.size());
				break;
			case "empty":
				System.out.println(d.isEmpty()?1:0);
				break;
			case "front":
				System.out.println(d.isEmpty()?-1:d.peekFirst()); //요소 제거 안하고 그것 출력
				break;
			case "back":
				System.out.println(d.isEmpty()?-1:d.peekLast());
				break;
			}
		}
		
	}

}
