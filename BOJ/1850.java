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
		
		long A=Long.parseLong(st.nextToken());
		long B=Long.parseLong(st.nextToken());
		
		long gcd=gcd(A,B);
		for(int i=0;i<gcd;i++) {
			bw.append(1+"");
		}
		bw.flush();bw.close();br.close();
	}

	public static long gcd(long n1, long n2) {
		if(n2==0) return n1;
		else {
			return gcd(n2, n1%n2);
		}
	}
}
