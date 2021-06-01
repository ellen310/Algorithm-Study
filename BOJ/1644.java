import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		int start=0,end=0,sum=0,cnt=0; //투포인터 쓸거임
		
		boolean[] primeCheck=new boolean[n+1];
		for(int i=0;i<primeCheck.length;i++) primeCheck[i]=true;
		
		primeCheck[0]=primeCheck[1]=false;
		for(int i=2;i<=n;i++) { //에라토스테네스 체
			for(int j=2;i*j<=n;j++) {
				primeCheck[i*j]=false;
			}
		}
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<primeCheck.length;i++) {
			if(primeCheck[i]==true) list.add(i); //소수만 따로 모음
		}
		
		for(start=0;start<list.size();start++) { //투포인터
			while(sum<n && end!=list.size()) {
				sum+=list.get(end);
				end++;
			}
			if(sum==n) cnt++;
			sum-=list.get(start);
		}

		bw.append(cnt+"");
		bw.flush();
		br.close();
		bw.close();
	}

}
