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
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int cnt=0;
		
		ArrayList<String> S=new ArrayList<>();
		while(N-->0) {
			S.add(br.readLine());
		}
		while(M-->0) {
			String str=br.readLine();
			if(S.contains(str)) cnt++;
		}
		
		bw.append(cnt+"");
		bw.flush();bw.close();br.close();
	}

}
