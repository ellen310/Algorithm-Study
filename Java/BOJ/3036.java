import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		int r[]=new int[n];
		for(int i=0;i<n;i++) r[i]=Integer.parseInt(st.nextToken());
		
		for(int i=1;i<n;i++) {
			int gcd=GCD(r[0],r[i]);
			bw.append( (r[0]/gcd) + "/" + (r[i]/gcd) +"\n");
		}
			bw.flush();bw.close();br.close();
	}
	
	public static int GCD(int n1, int n2) {
		if(n2==0) return n1;
		return GCD(n2, n1%n2);
	}

}
