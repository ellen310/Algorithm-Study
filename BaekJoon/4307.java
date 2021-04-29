import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T=Integer.parseInt(br.readLine());
		while(T-->0) {
			st=new StringTokenizer(br.readLine());
			int l=Integer.parseInt(st.nextToken());
			int n=Integer.parseInt(st.nextToken());
			int min=-1;
			int max=-1;
			
			while(n-->0) {
				int pos=Integer.parseInt(br.readLine()); 
				min=(min<Math.min(pos, l-pos))?Math.min(pos, l-pos):min; //왼/오 중 가까운 방향의 결과&& 다른개미들의 min보다는 오래걸리는 애 ==> 최솟값이니까
				max=(max<Math.max(pos, l-pos))?Math.max(pos, l-pos):max;
			}
			bw.append(min+" "+max+"\n");
		}
		bw.flush();bw.close();br.close();
	}

}
