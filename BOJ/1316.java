import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int n=Integer.parseInt(br.readLine());
		String[] arr=new String[n];
		int cnt=n;
		boolean[] alp=new boolean[26];
		
		
		for(int i=0;i<n;i++) {
			for(int k=0;k<alp.length;k++) alp[k]=false; //나오면 true로 바꿈
			arr[i]=br.readLine().trim();
			for(int j=1;j<arr[i].length();j++) {
				if(arr[i].charAt(j)!=arr[i].charAt(j-1)) {
					if(alp[arr[i].charAt(j)-97]==true) {
						cnt--;
						break;
					}alp[arr[i].charAt(j-1)-97]=true;
				}
			}
		}
		
		bw.append(cnt+"");
		bw.flush();
		bw.close();br.close();
	}

}
