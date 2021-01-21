import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		int[] nArr=new int[n];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) nArr[i]=Integer.parseInt(st.nextToken());
		
		Arrays.sort(nArr);
		
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				sum+=nArr[j];
			}
		}
		
		bw.append(sum+"");
		bw.flush();bw.close();br.close();
	}

}
