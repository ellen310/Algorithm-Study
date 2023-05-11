import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int dp[];
	static int juice[];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int n=Integer.parseInt(br.readLine());
		
		juice=new int[n+1]; 
		for(int i=1;i<=n;i++) {
			juice[i]=Integer.parseInt(br.readLine());
		}
		
		dp=new int[n+1];
		for(int i=0;i<dp.length;i++) dp[i]=-1;
		dp[0]=0; dp[1]=juice[1]; 
		if(n!=1) dp[2] = juice[1] + juice[2];
		
		bw.append(f(n)+"");
		bw.flush();
		bw.close();br.close();
	}
	
	public static int f(int n) {
		if(dp[n]!=-1) return dp[n];
	
		int num = juice[n] + Math.max( f(n-3)+juice[n-1] , f(n-2) );
		return dp[n]= Math.max(num, f(n-1));
	}

}
