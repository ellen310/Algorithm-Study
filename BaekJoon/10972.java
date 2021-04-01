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
		int arr[]=new int[n];
		int i;
		
		st=new StringTokenizer(br.readLine());
		for(i=0;i<n;i++) arr[i]=Integer.parseInt(st.nextToken());
		
		if(n==1) bw.append("-1");
		else {
			for(i=n-1;i>0;i--) if(arr[i]>arr[i-1]) break;
			if(i==0) bw.append("-1");
			else {
				int change= n-1;
				while(arr[change]<arr[i-1]) change--;
				
				int tmp=arr[i-1];
				arr[i-1]=arr[change];
				arr[change]=tmp;
				
				Arrays.sort(arr,i,n);
				
				for(int k=0;k<arr.length;k++) {
					bw.append(arr[k]+" ");
				}
			}
		}
		
		
		bw.flush();bw.close();br.close();
		

	}

}
