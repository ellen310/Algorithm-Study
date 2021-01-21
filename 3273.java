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
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		int[] nArr=new int[n];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) nArr[i]=Integer.parseInt(st.nextToken());

		int x=Integer.parseInt(br.readLine());
		
		int start=0,end=n-1,sum=0,cnt=0;
		
		Arrays.sort(nArr);
		
		while (start < end) {
			sum = nArr[start] + nArr[end];
			if(sum == x) {
				cnt++;
				start++;
			}
			else if(sum > x) end--;	
			else if(sum < x) start++;	
			
		}
		
		bw.append(cnt+"");
		bw.flush();
		bw.close();
		br.close();
	}

}
