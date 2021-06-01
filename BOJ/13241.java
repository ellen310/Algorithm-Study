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
		
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		
		bw.append(A*B/gcd(A,B)+"");
		bw.flush();bw.close();br.close();
	}
	
	public static int gcd(int n1, int n2) {
		if(n2==0) return n1;
		else {
			return gcd(n2, n1%n2);
		}
	}
}
