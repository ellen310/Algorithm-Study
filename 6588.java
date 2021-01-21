import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] primeCheck=new boolean[1000001];
		for(int i=0;i<primeCheck.length;i++) primeCheck[i]=true;
		
		primeCheck[0]=primeCheck[1]=false;
		for(int i=2;i<primeCheck.length;i++) { //범위내의 모든 소수를 미리 구해둠
			for(int j=2;i*j<primeCheck.length;j++) {
				primeCheck[i*j]=false;
			}
		}
		
		while(true) {
			int n=Integer.parseInt(br.readLine());
			if(n==0) break;
			int check=0;
			
			for(int i=2;i<=n/2;i++) { // 2부터 1더해가며 + n-2부터 1빼가며 =>둘의 합은 n. 둘 다 소수이면 출력
				if(primeCheck[i]==true && primeCheck[n-i]==true) {
					bw.append(n+" = "+i+" + "+(n-i)+"\n");
					bw.flush();
					check=1;
					break;
				}
			}
			if(check==0) bw.append("Goldbach's conjecture is wrong.\n");
		}
		
		
		
		
	}

}
