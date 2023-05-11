import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static Integer[][] dp = new Integer[41][2];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		dp[0][0]=1; dp[0][1]=0;
		dp[1][0]=0; dp[1][1]=1;
		
		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int n=Integer.parseInt(br.readLine());
			fib(n);
			bw.append(dp[n][0]+" "+dp[n][1]+"\n");
			bw.flush();
		}
		
		bw.close();br.close();
	}

	
	public static Integer[] fib(int n) { //null 처리를 위해
		if(dp[n][0]==null || dp[n][1]==null) {
			dp[n][0]= fib(n-1)[0] + fib(n-2)[0];
			dp[n][1]= fib(n-1)[1] + fib(n-2)[1];
		}
			
		return dp[n];
	}
}
