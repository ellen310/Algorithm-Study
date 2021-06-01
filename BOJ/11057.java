import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int mod=10007;
		
		int N=Integer.parseInt(br.readLine());
		int dp[][]=new int[10][1001]; //[수열 끝부분 수][길이]
		int result=0;
		Arrays.fill(dp[0], 1);
		for(int i=0;i<=9;i++) {
			dp[i][1]=1; 
		}
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=N;j++) {
				for(int k=i;k>=0;k--) {
					dp[i][j]+= dp[k][j-1] %mod ;
				}
			}
		}
		
		for(int i=0;i<=9;i++) {
			result += dp[i][N]%mod;
		}
		
		bw.append(result%mod+"");
		bw.flush();bw.close();br.close();
	}
	


}
