import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

	static String maxName;
	static int max=-1;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		HashMap<String,Integer> hm=new HashMap<>();
		
		int N=Integer.parseInt(br.readLine());
		while(N-->0) {
			String str=br.readLine();
			if(hm.containsKey(str)) {
				hm.replace(str, hm.get(str)+1);
			}else {
				hm.put(str, 1);
			}
		}
				
		hm.forEach((key,value)->f(key,value));
		bw.append(maxName+"");
		bw.flush();bw.close();br.close();
	}
	
	public static void f(String key, int value) {
		if(value>max) {
			max=value;
			maxName=key;
		}else if(value==max) {
			if(maxName.compareTo(key)>0) {
				maxName=key;
			}
		}
	}

}
