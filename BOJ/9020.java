import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		int t=Integer.parseInt(br.readLine());
		
		boolean[] prime=new boolean[10001];
		for(int i=0; i<prime.length ;i++) prime[i]=true;
		prime[0]=prime[1]=false;
		
		for(int i=2;i<=10000;i++) { //에라토스테네스 체
			for(int j=2;i*j<=10000;j++) {
				prime[i*j]=false;
			}
		}
		
		
		while(t-- >0) {
			int n=Integer.parseInt(br.readLine());
			
			for(int i=0;i<n/2;i++) {
				if(prime[(n/2)-i]&&prime[(n/2)+i]) { //절반에서 한쪽은 1을 더해가고, 한쪽은 1을 빼가면서 둘다 소수인때를 찾음
					bw.append(((n/2)-i)+" "+((n/2)+i)+"\n");
					bw.flush();
					break;
				}
			}
		}
		
		
		
		
		bw.close();
		br.close();
	}

}
