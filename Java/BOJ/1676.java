import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		int cnt=0;
		
		for(int i=1;i<=n;i++) {
			if(i%125==0) cnt=cnt+3;
			else if(i%25==0) cnt=cnt+2;
			else if(i%5==0) cnt++;
		}
		
		System.out.println(cnt);
		
		
	}

}
