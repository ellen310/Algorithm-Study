import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
		int t=Integer.parseInt(br.readLine());
		int[] dp=new int[11];
		
		for(int i=0;i<t;i++) {
			int n=Integer.parseInt(br.readLine());
			dp[1]=1;
			dp[2]=2;
			dp[3]=4;
			for(int j=4;j<=10;j++) {
				dp[j]=dp[j-1]+dp[j-2]+dp[j-3];
			}
			bw.append(dp[n]+"\n");
			bw.flush();
		}
		
		
		bw.close();
		br.close();
		
	}

}
