import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

	static HashMap<Long, Long> dp = new HashMap<Long, Long>();
	static long mod=1000000007;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		long N=Long.parseLong(br.readLine());
		
		bw.append(fib(N)+"");
		bw.flush();bw.close();br.close();
	}
	
	public static long fib(long N) {
		if(N==0) return 0;
		else if(N==1||N==2) return 1;
		else if(dp.containsKey(N)) return dp.get(N);
		else {
			if(N%2==1) {
				long num = (N + 1)/2;
				dp.put(N, (fib(num)*fib(num) + fib(num-1)*fib(num-1))%mod);
				return dp.get(N);
			}else {
				 long num = N / 2;
				 dp.put(N, (2*fib(num-1) + fib(num))*fib(num)%mod);
		         return dp.get(N);
			}
		}
	}

}
