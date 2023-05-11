import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		int cnt=0;
		
		while(N-->0) {
			Stack<Character> st=new Stack<>();
			String str=br.readLine();
			for(int i=0;i<str.length();i++) {
				if(!st.isEmpty() && st.peek()==str.charAt(i)) st.pop();
				else st.push(str.charAt(i));
			}
			if(st.isEmpty()) cnt++;
		}
		
		bw.append(cnt+"");
		bw.flush();br.close();bw.close();

	}

}
