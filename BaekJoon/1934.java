import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T=Integer.parseInt(br.readLine());
		int result[]=new int[T];

		for(int i=0;i<T;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n1=Integer.parseInt(st.nextToken());
			int n2=Integer.parseInt(st.nextToken());
			result[i]=(n1*n2)/GCD(n1,n2);
		}
		
		for(int item:result) {
			bw.append(item+"\n");
		}
		bw.flush();bw.close();br.close();

	}

	public static int GCD(int n1, int n2) {
		if(n2==0) return n1;
		return GCD(n2,n1%n2);
	}
}
