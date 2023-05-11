import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		Stack<Object> stack=new Stack<>();
		
		for(int i=0; i<n ;i++) {
			st = new StringTokenizer( br.readLine() );
			String order=st.nextToken();
			
			switch(order) {
			case "push":
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop": 
				System.out.println(stack.isEmpty()?-1:stack.pop());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				System.out.println(stack.isEmpty()?1:0);
				break;
			case "top":
				System.out.println(stack.isEmpty()?-1:stack.peek());
				break;
			}
		}
		
	}

}
