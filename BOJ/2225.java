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
		
		int dp[][]=new int[k+1][n+1]; //[k-1][0~n];�� ����� �� �� ���ϸ� ��. 
		
		for(int i=0;i<=n;i++) { // k�� 1�϶� 1
			dp[1][i]=1;
		}
		
		for(int i=2;i<=k;i++) {
			dp[i][0]=1; // n�� 0�϶� 1 
			for(int j=1;j<=n;j++) {
				dp[i][j]=(dp[i-1][j]+dp[i][j-1])%1000000000; //��) k=3, n=1 -> 2���� 1�� ����� ���+ 2����0�� ����� ���
			}
		}

		bw.append(dp[k][n]+"");
		bw.flush();bw.close();br.close();
	}

}
