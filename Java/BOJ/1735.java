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
		
		int c1=Integer.parseInt(st.nextToken());
		int m1=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine());
		int c2=Integer.parseInt(st.nextToken());
		int m2=Integer.parseInt(st.nextToken());
		
		int m=m1*m2;
		int c=m2*c1+m1*c2;
		int GCD=gcd(m , c);
		
		bw.append(c/GCD+" "+m/GCD);
		bw.flush();bw.close();br.close();
	}

	public static int  gcd(int n1, int n2) {
		if(n2==0) return n1;
		else {
			return gcd(n2, n1%n2);
		}
	}
}
