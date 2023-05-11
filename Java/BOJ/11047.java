import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		int[] nArr=new int[n];
		for(int i=0;i<nArr.length;i++) nArr[i]=Integer.parseInt(br.readLine());

		int result=0;
		
		for(int i=nArr.length-1;i>=0;i--) {
			while(k>=nArr[i]) {
				result+=k/nArr[i];
				k=k%nArr[i];
			}
		}
		
		bw.append(result+"");
		bw.flush();
		bw.close();br.close();
	}

}
