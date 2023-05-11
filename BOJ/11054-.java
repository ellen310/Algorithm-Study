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
		for(int i=0;i<n;i++) { //����->���������� Ŀ���� dp
			dpL[i]=1;
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) dpL[i]=Math.max(dpL[i], dpL[j]+1);
			}
		}
		
		int dpR[]=new int[n];
		for(int i=n-1;i>0;i--) { //��->�� ���� Ŀ���� dp
			dpR[i]=1;
			for(int j=n-1;j>i;j--) {
				if(arr[j]<arr[i]) dpR[i]=Math.max(dpR[i], dpR[j]+1);
			}
		}
		
		int max=0;
		for(int i=0;i<n;i++) { //�ִ� 
			max=Math.max(max, dpL[i]+dpR[i]);
		}
		
		if(n==1) {
			bw.append(max+"");
		}else {
			bw.append(max-1+""); //�� ū �� �ߺ�����
		}
		
		bw.flush();bw.close();br.close();
	}

}
