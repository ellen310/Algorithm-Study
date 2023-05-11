import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int k=Integer.parseInt(br.readLine());
		Stack<Integer> st=new Stack<Integer>();
		while(k-->0) {
			int num=Integer.parseInt(br.readLine());
			if(num==0) st.pop();
			else st.add(num);
		}
		
		int sum=0;
		for(int item:st) {
			sum+=item;
		}
		
		bw.append(sum+"");
		bw.flush();bw.close();br.close();
	}

}
