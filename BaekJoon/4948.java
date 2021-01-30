import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int n=Integer.parseInt(br.readLine());
			if(n==0) break;
			int cnt=0;
			
			boolean[] prime=new boolean[2*n+1];
			for(int i=0; i<prime.length ;i++) prime[i]=true;
			prime[0]=prime[1]=false;
			
			for(int i=2;i<=2*n;i++) { //에라토스테네스 체
				for(int j=2;i*j<=2*n;j++) {
					prime[i*j]=false;
				}
			}
			
			for(int i=n+1;i<=2*n;i++) { //n보다 크고 2n보다 작거나 같은 소수
				if(prime[i]) cnt++;
			}
			bw.append(cnt+"\n");
			bw.flush();
		}

		
		bw.close();
		br.close();
	}

}
