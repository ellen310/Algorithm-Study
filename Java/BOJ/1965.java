import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int[] box;
	static int[] dp;
 
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		box=new int[n];
		dp=new int[n];
		int max=-1;
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			box[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<n;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(box[i]>box[j]) dp[i]=Math.max(dp[i], dp[j]+1);
			}
			 max=Math.max(max, dp[i]);
		}
		
		bw.append(max+"");
		bw.flush();
		bw.close();br.close();
	}

}
