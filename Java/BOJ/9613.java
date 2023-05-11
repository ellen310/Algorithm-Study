import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine());
		int arr[];
		
		
		while(T-->0) {
			st=new StringTokenizer(br.readLine());
			arr=new int[Integer.parseInt(st.nextToken())];
			for(int i=0;i<arr.length;i++) arr[i]=Integer.parseInt(st.nextToken());
			int sum=0;
			
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					sum+=gcd(arr[i],arr[j]);
				}
			}
			
			bw.append(sum+"\n");
			bw.flush();
		}
		

	}
	
	public static int gcd(int n1, int n2) {
		if(n2==0) return n1;
		else {
			return gcd(n2, n1%n2);
		}
	}

}
