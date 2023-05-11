import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=0;
		
		while(true) {
			T++;
			int cnt=0;
			String str=br.readLine();
			if(str.contains("-")) break;
			Stack<Character> st=new Stack<>();
			for(int i=0;i<str.length();i++) { //짝이 맞는 애들은 미리 정리
				if(!st.isEmpty() && st.peek()=='{' && str.charAt(i)=='}') st.pop();
				else st.add(str.charAt(i));
			}
			
			while(!st.isEmpty()) {
				char now=st.pop();
				
				if(now=='{') {
					if(!st.isEmpty()&&st.peek()=='{') {
						st.pop(); cnt++;
					}
				}else { 
					if(!st.isEmpty()&&st.peek()=='{') {
						cnt+=2;
						st.pop();
					}else if(!st.isEmpty()&&st.peek()=='}'){
						cnt++;
						st.pop();
					}else {
						cnt+=2;
					}
				}
			}
			
			bw.append(T+". "+cnt+"\n");
			bw.flush();
		}
	}

}
