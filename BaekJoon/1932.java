import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int[][] dp;
	static int[][] tri;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		
		tri=new int[n+1][n+1]; //층, 위치
		dp=new int[n+1][n+1]; //1층 1번째에 최댓값이 오도록 할거
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++)
				dp[i][j]=-1;
		}
		
		for(int i=1;i<=n;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=1;j<=i;j++) {
				tri[i][j]=Integer.parseInt(st.nextToken());
				if(i==n) {//마지막층 데이터는 dp에 저장해서 활용할라고
					dp[i][j]=tri[i][j];
				}
				
			}
		}
		
		bw.append(f(1,1)+"");
		
		bw.close();br.close();
	}

	
	public static int f(int n1, int n2) { //층, 위치
		if(dp[n1][n2]!=-1) return dp[n1][n2];
		return dp[n1][n2]=tri[n1][n2]+Math.max(f(n1+1, n2), f(n1+1, n2+1)); //밑에층의 왼쪽대각선, 오른쪽대각선 애들 비교
	}
}
