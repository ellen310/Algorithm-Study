import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] dp; //맨끝줄끼리 비교, max출력
	static int[][] home; //집, 색깔(가격)

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		dp=new int[n][3];
		home=new int[n][3];
		int min=1000000;
		
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<3;j++) {
				home[i][j]=Integer.parseInt(st.nextToken());
				if(i==n-1) dp[i][j]=home[i][j];
			}
		}
		
		
		for(int i=0;i<3;i++) {
			f(0,i);
			if(dp[0][i]<min) min=dp[0][i];
		}
		
		bw.append(min+"");
		bw.flush();
		bw.close();br.close();
		
		
	}
	
	public static int f(int num, int color) {
		if(dp[num][color]!=0) return dp[num][color];
		
		if(color==0) {
			return dp[num][color]= home[num][color] + Math.min(f(num+1, 1), f(num+1, 2));
		}else if(color==1) {
			return dp[num][color]= home[num][color] + Math.min(f(num+1, 0), f(num+1, 2));
		}else {
			return dp[num][color]= home[num][color] + Math.min(f(num+1, 0), f(num+1, 1));
		}
		
		
	}

}
