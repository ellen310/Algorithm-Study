import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count=99; //한수개수. n이 100보다 작으면 무조건 n만큼 한수니까 그렇게 대입할것. 100보다 크면 최소99보단 큼 
		int n=Integer.parseInt(br.readLine());
		
		if(n<100) {
			count=n;
		}else {
			if(n==1000) n=999;
			
			for(int i=100;i<=n;i++) {
				int n100=i/100; //100의자리 수
				int n10=(i-n100*100)/10; //10의자리 수
				int n1=i%10; //1의자리 수
				
				if((n100-n10)==(n10-n1)) count++;
			}
		}
		
		bw.append(count+"\n");
		bw.flush();
		br.close();
		bw.close();
	}

}
