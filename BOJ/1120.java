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
		
		String A=st.nextToken();
		String B=st.nextToken();
		int result=51;
		
		for(int i=0;i<=B.length()-A.length();i++) {
			int cnt=0;
			int indexB=i;
			for(int j=0;j<A.length();j++, indexB++) {
				if(A.charAt(j)==B.charAt(indexB)) continue;
				cnt++;
			}
			result=Math.min(result, cnt);
		}
		
		bw.append(result+"");
		bw.flush();bw.close();br.close();
	}

}
