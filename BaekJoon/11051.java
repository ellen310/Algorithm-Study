import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int dp[][];
	static int mod=10007;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		dp=new int[n+1][k+1];

		bw.append(f(n,k)+"");
		bw.flush();bw.close();br.close();
	}

	public static int f(int n, int k) {
		if(dp[n][k]>0) return dp[n][k]%mod;
		if(n==k||k==0) return dp[n][k]=1%mod;
		return dp[n][k]= (f(n-1,k-1) + f(n-1, k))%mod;
	}
}
