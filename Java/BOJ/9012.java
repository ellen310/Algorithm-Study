import java.io.*;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++) { //���ڿ��� n�� ����
			boolean VPS=true;
			String strP=br.readLine();
			Stack<Character> stack=new Stack<Character>();
			char c;
			for(int j=0 ; j<strP.length() ; j++) { //���ڿ��� ���̸�ŭ üũ
				c=strP.charAt(j);
				if(c=='(') {
					stack.push('('); //���°�ȣ�̸� stack�� ����
				}
				else{
					if(!stack.isEmpty()) stack.pop();
					else {
						VPS=false;
						break;
					}
				}
			}
			if(!stack.isEmpty()) VPS=false;
			
			if(VPS) {
				bw.append("YES\n");
				bw.flush();
			}else {
				bw.append("NO\n");
				bw.flush();
			}
		}
		
		
	}

}
