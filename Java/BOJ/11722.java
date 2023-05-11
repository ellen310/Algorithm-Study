import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		
		int arr[]=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(st.nextToken());

		int dp[]=new int[n];
		for(int i=0;i<n;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(arr[i]<arr[j])
				dp[i]=Math.max(dp[i], dp[j]+1);
			}
		}
		
		int max=0;
		for(int i=0;i<n;i++) {
			max=dp[i]>max?dp[i]:max;
		}
		
		bw.append(max+"");
		bw.flush();bw.close();br.close();
	}
}
		
		

