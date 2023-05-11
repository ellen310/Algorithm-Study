import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static boolean[] primeCheck;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		primeCheck=new boolean[2000001];
		for(int i=0;i<primeCheck.length;i++) primeCheck[i]=true;
		
		primeCheck[0]=primeCheck[1]=false;
		for(int i=2;i<primeCheck.length;i++) { //route(범위)내의 모든 소수를 미리 구해둠. 이따 isPrime()에 활용. 구한 소수의 범위보다 큰애들 => 구해놓은 소수로 나눠지면 소수아님.
			for(int j=2;i*j<primeCheck.length;j++) {
				primeCheck[i*j]=false;
			}
		}
		
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0) {
			st=new StringTokenizer(br.readLine());
			long a=Long.parseLong(st.nextToken());
			long b=Long.parseLong(st.nextToken());
			
			if(a+b==2) {
				bw.append("NO\n");
				bw.flush();
			}
			else if((a+b)%2==0) {
				bw.append("YES\n"); //골드바흐에 따라
				bw.flush();
			}
			else {
				bw.append(isPrime(a+b-2)?"YES\n":"NO\n"); //a,b의 합이 홀수일땐 무조건 2와 a+b-2의 조합 => 짝수인 소수는2밖에 없으니까. 
				bw.flush();
			}
		}
		
		bw.close();
		br.close();
	
	}
	
	public static boolean isPrime(long check) { 
		if(check<primeCheck.length) { //구해둔 소수 범위내라면
			return primeCheck[(int)check];
		}else {
			for(int i=0;i<primeCheck.length;i++) {
				if(primeCheck[i]) { //소수로 check를 나눠봄
					if(check%i==0) return false;
				}
			}
			return true; //check를 나눌 수 있는 소수가 없다면 check는 소수
		}
	}

}
