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
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		int cnt=0;
		
		int arr[]=new int[N+1];
		for(int i=0;i<=N;i++) arr[i]=i;
		
		boolean check[]=new boolean[N+1];
		check[0]=check[1]=false;
		for(int i=2;i<=N;i++) check[i]=true;
		
		for(int i=2;i<=N;i++) {
			for(int j=i; j<=N; j+=i) {
				if(check[j] == true) {
				check[j]=false;
				cnt++;
				}
				if(cnt==K) {
					bw.append(j+"");
					bw.flush();
					System.exit(0);
				}
			}
		}

	}

}
