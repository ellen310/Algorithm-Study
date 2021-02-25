import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());

		st.nextToken();
		int K=Integer.parseInt(st.nextToken());
		int L=Integer.parseInt(st.nextToken());
		int cnt=0;
		
		while(K!=L) {
			cnt++;
			K=K/2+K%2;
			L=L/2+L%2;
		}
		
		bw.append(cnt+"");
		bw.flush();bw.close();br.close();
	}

}
