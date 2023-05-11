import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int n=Integer.parseInt(br.readLine());
			HashMap<String, Integer> hm = new HashMap<>();
			
			for(int i=0;i<n;i++) {
				StringTokenizer st=new StringTokenizer(br.readLine());
				st.nextToken();
				String type=st.nextToken();
				
				if(hm.containsKey(type)) hm.put(type, hm.get(type)+1);
				else hm.put(type, 1);
			}
			
			int result=1;
			for(int value:hm.values()) {
				result*=(value+1);
			}
			
			bw.append(result-1+"\n");
		}
		
		
		bw.flush();br.close();bw.close();

	}

}
