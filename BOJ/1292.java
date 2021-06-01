import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=1;i<=1000;i++) {
			for(int j=0;j<i;j++) {
				al.add(i);
			}
		}
		
		int result=0;
		for(int i=A;i<=B;i++) {
			result+=al.get(i-1);
		}
		
		bw.append(result+"");
		bw.flush();bw.close();br.close();
	}

}
