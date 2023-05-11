import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int arr[];
	static int tmp[];
	static boolean check[];
	static int N=0;
	static int result=0;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		N=Integer.parseInt(br.readLine());
		arr=new int[N];
		tmp=new int[N];
		check=new boolean[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		f(0);
		bw.append(result+"");
		bw.flush();bw.close();br.close();
		

	}
	
	public static void f(int num) {
		int sum=0;
		if(num==N) {
			for(int i=0;i<N-1;i++) {
				sum+=Math.abs(tmp[i+1]-tmp[i]);
			}
			result=Math.max(result,sum);
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!check[i]) {
				check[i]=true;
				tmp[num]=arr[i];
				f(num+1);
				check[i]=false;
			}
		}
	}

}
