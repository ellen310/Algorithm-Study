import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		Queue<Integer> queue=new LinkedList<>();
		int num=0; //back��ɿ��� ���: ���������� push�� ������ ���⿡ ����ص״ٰ� ��ȯ
		
		for(int i=0; i<n ;i++) {
			st = new StringTokenizer( br.readLine() );
			String order=st.nextToken();
			
			switch(order) {
			case "push":
				num=Integer.parseInt(st.nextToken());
				queue.offer(num);
				break;
			case "pop": 
				sb.append(queue.isEmpty()?-1:queue.poll()).append('\n');
				break;
			case "size":
				sb.append(queue.size()).append('\n');
				break;
			case "empty":
				sb.append(queue.isEmpty()?1:0).append('\n');
				break;
			case "front":
				sb.append(queue.isEmpty()?-1:queue.peek()).append('\n');
				break;
			case "back":
				sb.append(queue.isEmpty()?-1:num).append('\n');
				break;
			}
			System.out.print(sb);
		}
		
	}

}
