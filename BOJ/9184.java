import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int[][][] dp = new int[21][21][21]; 
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		while(true) {
			st=new StringTokenizer(br.readLine());
			int n1=Integer.parseInt(st.nextToken());
			int n2=Integer.parseInt(st.nextToken());
			int n3=Integer.parseInt(st.nextToken());
			
			if(n1==-1&&n2==-1&&n3==-1) break;
			
			
			bw.append("w("+n1+", "+n2+", "+n3+") = "+ w(n1,n2,n3) +"\n");
			bw.flush();
			
		}

		bw.close();br.close();
	}

	public static int w(int a, int b, int c) {
		
		if(0<=a&&a<=20  &&  0<=b&&b<=20  &&  0<=c&&c<=20) {
			if(dp[a][b][c]!=0) 
				return dp[a][b][c];
		}
		
		if (a <= 0 || b <= 0 || c <= 0)
			return 1;
		
		if (a > 20 || b > 20 || c > 20)
			return dp[20][20][20]=w(20, 20, 20);

		if (a < b && b < c)
			return dp[a][b][c]=w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);

		return dp[a][b][c]=w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
}
