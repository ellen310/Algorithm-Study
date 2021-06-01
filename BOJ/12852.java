import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static int[] dp;
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		dp=new int[n+1];
		dp[0]=0; dp[1]=0; 
	
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+1;
			if(i%2==0) {
				dp[i]=Math.min(dp[i], dp[i/2]+1);
			}
			if(i%3==0) {
				dp[i]=Math.min(dp[i], dp[i/3]+1);
			}
		}
		
		bw.append(dp[n]+"\n");
		f(n);
		
		bw.flush();
		bw.close();br.close();

	}
	
	public static void f(int n) throws IOException {
		if(n==0) return;
		
		bw.append(n+" ");
		
		if(n-1>=0 && dp[n-1]==dp[n]-1) f(n-1);
		else if(n%3==0 && dp[n/3]==dp[n]-1) f(n/3);
		else if(n%2==0 && dp[n/2]==dp[n]-1) f(n/2);
	}
	

}
