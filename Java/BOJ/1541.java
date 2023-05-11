import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str1=br.readLine();
		int total=0;
		int check=0; //첫토큰인지 확인
		StringTokenizer subSt=new StringTokenizer(str1,"-");
		while(subSt.hasMoreTokens()) {
			int sum=0;
			StringTokenizer addSt=new StringTokenizer(subSt.nextToken(), "+");
			while(addSt.hasMoreTokens()) {
				sum+=Integer.parseInt(addSt.nextToken());
			}
			
			if(str1.charAt(0)=='-') total-=sum;
			else {
				if(check==0) {
					total+=sum;
				}else total-=sum;
			}
			check=1;
		}
		
		bw.append(total+"");
		bw.flush();bw.close();br.close();
	}

}
