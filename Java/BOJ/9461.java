import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static long[] dp=new long[101];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int T=Integer.parseInt(br.readLine());
		dp[0]=0; dp[1]=1; dp[2]=1;dp[3]=1;
		
		
		while(T-->0) {
			int n=Integer.parseInt(br.readLine());
			bw.append(P(n)+"\n");
			bw.flush();
		}
		
		bw.close();br.close();
	}

	
	public static long P(int n) {
		if(n==1||n==2||n==3) return dp[n];
		if(dp[n]!=0) return dp[n];
		return dp[n]=P(n-2)+P(n-3);
	}
}
