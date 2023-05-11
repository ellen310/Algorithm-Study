import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int arr[];
	static Integer dp[];
	static int max;

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		arr=new int[n];
		dp=new Integer[n];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(st.nextToken());
		
		dp[0]=max=arr[0];
		
		f(n-1);
		
		bw.append(max+"");
		bw.flush();bw.close();br.close();
	}
	
	public static int f(int n) {
		if(dp[n]==null) {
			dp[n]=Math.max(f(n-1)+arr[n], arr[n]); //���� ���ӵ� ���� ��+�ڽ� vs �ڽ�
			if(max<dp[n]) max=dp[n]; //���� ���ӵ�(Ȥ�� �ϳ���)���� �պ��� �� ū �����(dp[n])���Դٸ�
		}
		
		return dp[n];
	}

}
