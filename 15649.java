import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int m, n;
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] arr;
	static int[] check;

	public static void main(String[] args) throws Exception{

		StringTokenizer st=new StringTokenizer(br.readLine());
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());

		arr=new int[m];
		check=new int[n+1];
		
		dfs(n,m,0);
	}
	
	public static void dfs(int n, int m, int depth) {
		if(depth == m) {
			for(int item : arr) {
				System.out.print(item+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			if(check[i]==0) {
				check[i] = 1;
				arr[depth] = i;
				dfs(n, m, depth+1);
				check[i] = 0;
			}
		}
		return;
	}

}
