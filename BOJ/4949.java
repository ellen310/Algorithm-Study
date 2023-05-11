import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Character> st=new Stack<>();

		
		while(true) {
			int check=0;
			st=new Stack<>();
			String str=br.readLine();
			if(str.equals(".")) break;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='(') {
					st.add('(');
				}
				else if(str.charAt(i)==')') {
					if(st.isEmpty() || st.peek()!='(') {
					//	bw.append("no\n");
						check=1;
						break;
					} else st.pop();
				}
				else if(str.charAt(i)=='[') {
					st.add('[');
				}
				else if(str.charAt(i)==']') {
					if(st.isEmpty() || st.peek()!='[') {
					//	bw.append("no\n");
						check=1;
						break;
					}else st.pop();
				}
			}
			if(st.isEmpty()&&check==0) bw.append("yes\n");
			else bw.append("no\n");
			bw.flush();
		}
		
		
		bw.close();br.close();
	}

}
