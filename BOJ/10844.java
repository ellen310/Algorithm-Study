import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	static int dp[][];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int N=Integer.parseInt(br.readLine());
		int mod=1000000000;
		int result=0;
		
		dp=new int[N+1][10]; 
		
		for(int i=1;i<=9;i++) {
			dp[1][i]=1;
		}
		
		for(int i=2;i<N+1;i++) {
			dp[i][0]=dp[i-1][1];
	        dp[i][9]=dp[i-1][8];
			for(int j=1;j<9;j++) {
				dp[i][j]=(dp[i-1][j-1]+dp[i-1][j+1])%mod;
			}
		}
		
		for(int item : dp[N]) {
			result += item;
			result = result%mod;
		}
		
		bw.append(result+"");
		bw.flush();
		bw.close();br.close();
	}
	
}
