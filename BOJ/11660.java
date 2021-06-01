import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		 int[][] arr = new int[n+1][n+1];
	     int[][] dp = new int[n+1][n+1];
	     int result[]= new int[m];
		
	     for(int i=1; i<=n; i++) {
	    	 st=new StringTokenizer(br.readLine());
	            for(int j = 1; j<=n; j++) {
	                arr[i][j] = Integer.parseInt(st.nextToken());
	            }
	        }
		
	     for(int i=1; i<=n; i++) {
	            for(int j=1; j<=n; j++) {
	                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + arr[i][j];
	            }
	        }
		
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			
			result[i] += dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1];
 
        }
		
		
		for(int item:result) {
			bw.append(item+"\n");
		}
		bw.flush();
		bw.close();br.close();
		
	}

}
