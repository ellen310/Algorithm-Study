import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken()); 
		int k=Integer.parseInt(st.nextToken());
		
		int arr[]=new int[n+1]; //동전
		for(int i=1;i<=n;i++) arr[i]=Integer.parseInt(br.readLine());
		
		int dp[]=new int[k+1]; //1~k별 합. 
		dp[0]=1;
		
		for(int i=1;i<=n;i++) { //동전별로 dp[1]~dp[k]까지 돌면서 경우의 수를 누적시킴
			for(int j=arr[i];j<=k;j++) {
				dp[j] += dp[j-arr[i]];
			}
		}

		bw.append(dp[k]+"");
		bw.flush();bw.close();br.close();
	}

}
