import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int X=Integer.parseInt(br.readLine());
		int end=X;
		int cnt=0;
		int length=64;
		int check=0;
		
		while(true) {
			if(X==64) {
				cnt++;
				break;
			}
			
			length=length/2;
			
			if(length<=X) {
				check+=length;
				cnt++;
				
				if(end==check) break;
				
				X=X-length;
			}
		}
		
		bw.append(cnt+"");
		bw.flush();bw.close();br.close();
	}

}
