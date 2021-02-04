import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		
		int arr[]=new int[n];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(st.nextToken());
		
		int dpL[]=new int[n];
		for(int i=0;i<n;i++) { //왼쪽->오른쪽으로 커지는 dp
			dpL[i]=1;
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) dpL[i]=Math.max(dpL[i], dpL[j]+1);
			}
		}
		
		int dpR[]=new int[n];
		for(int i=n-1;i>0;i--) { //오->왼 으로 커지는 dp
			dpR[i]=1;
			for(int j=n-1;j>i;j--) {
				if(arr[j]<arr[i]) dpR[i]=Math.max(dpR[i], dpR[j]+1);
			}
		}
		
		int max=0;
		for(int i=0;i<n;i++) { //최대 
			max=Math.max(max, dpL[i]+dpR[i]);
		}
		
		if(n==1) {
			bw.append(max+"");
		}else {
			bw.append(max-1+""); //젤 큰 수 중복제거
		}
		
		bw.flush();bw.close();br.close();
	}

}
