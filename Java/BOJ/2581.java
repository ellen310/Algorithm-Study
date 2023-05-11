import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int sum=0, min=0;
		boolean[] prime=new boolean[n+1]; //소수는 true, 이후 true만 출력
		
		for(int i=0;i<prime.length;i++) prime[i]=true;
		
		
		prime[0]=prime[1]=false; //0과 1 은 소수가 아님
		
		for(int i=2;i<n;i++) { //에라토스테네스의 체
			for(int j=2;j*i<=n;j++) {
				prime[i*j]=false;
			}
		}
		
		
		for(int i=m;i<=n;i++) {
			if(prime[i]) sum+=i; //소수이면 합함
		}
		
		for(int i=m;i<=n;i++) {
			if(prime[i]) {
				min+=i; //소수이면 합함
				break;
			}
		}
		
		if(sum==0) {
			bw.append(-1+"\n");
		}else {
			bw.append(sum+"\n");
			bw.append(min+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
