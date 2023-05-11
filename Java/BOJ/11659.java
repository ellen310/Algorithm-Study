import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		int arr[]=new int[n+1]; //n���� ��
		int prefix[]= new int[n+1]; //���� ��
		int result[]=new int[m]; //����� ���
		
		st=new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) arr[i]=Integer.parseInt(st.nextToken());
		
		int sum=0;
		for(int i=1;i<=n;i++) { //������ ����
			sum+=arr[i];
			prefix[i] = sum;
		}
		
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine());
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			
			result[i]=prefix[end]-prefix[start-1];
		}
		
		for(int item:result) {
			bw.append(item+"\n");
		}
		bw.flush();
		bw.close();br.close();
		
	}

}
