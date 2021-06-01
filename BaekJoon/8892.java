import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {


	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int N=Integer.parseInt(br.readLine());
			String arr[]= new String[N];
			boolean check=false;
			
			for(int i=0;i<N;i++) {
				arr[i]=br.readLine();
			}
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(i==j) continue;
					String str=arr[i]+arr[j];
					for(int k=0;k<str.length()/2;k++) {
						if(str.charAt(k)!=str.charAt(str.length()-(k+1))) { //양 끝 비교
							break;
						}
						if(k==str.length()/2-1 && str.charAt(k)==str.charAt(str.length()-(k+1))) { //중간까지 왔는데 같다면
							if(!check) {
								bw.append(str+"\n");
								check=true;
							}
						}
					}
				}
			}
			if(!check) bw.append("0\n");
			bw.flush();
		}
		bw.close();br.close();
	}

}
