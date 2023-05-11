import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	
	public static class Judge {
		int age;
		String name;
        
		public Judge(int age, String name) {
			this.age = age;
			this.name = name;
		}
        
	}
		
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		Judge[] j=new Judge[n];
		
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			j[i] = new Judge(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		
		Arrays.sort(j, new Comparator<Judge>(){
			public int compare(Judge j1, Judge j2) {
				return j1.age-j2.age;
			}
		});
		
		for(int i=0;i<n;i++) {
			bw.append(j[i].age+" "+j[i].name+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
