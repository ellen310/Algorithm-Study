import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			int N=Integer.parseInt(br.readLine());
			if(N==0) break;
			TreeSet<Integer> ts=new TreeSet<>();
			
			while(N-->0) {
				ts.add(Integer.parseInt(br.readLine()));
			}
			
			if(ts.first()!=0 && ts.first()>200) {
				bw.append("IMPOSSIBLE\n");
				break;
			}else {
				while(ts.size()!=1) {
					if( Math.abs(ts.pollFirst()-ts.first())>200 ) {
						bw.append("IMPOSSIBLE\n");
						break;
					}
					if(ts.size()==1) {
						if(1422-ts.first()>100) bw.append("IMPOSSIBLE\n");
						else bw.append("POSSIBLE\n");
					}
				}
			}
			bw.flush();
		}
		bw.close();br.close();
	}

}
