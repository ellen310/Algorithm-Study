import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		int[] nArr=new int[n];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) nArr[i]=Integer.parseInt(st.nextToken());
		
		int start=0, end=0, sum=0, cnt=0;
		
		for(start=0;start<n;start++) { //투포인터
			while(sum<m && end!=n) { //sum이 구하려는값보다 작으면 end의 위치를 증가시켜가며 합 구함
				sum+=nArr[end];
				end++;
			}
			if(sum==m) cnt++; //sum이 구하려는값과 같아지면 cnt++. 
			sum-=nArr[start]; //어차피 이제 sum이 m보다 커질테니까(sum==m이었으니까 양수값 뭘더해도 구하려는값보다 큼) start에 1을 증가시킬거라 생각하고 sum에서 start를 빼줌
		}
		
		bw.append(cnt+"");
		
		bw.flush();
		bw.close();
		br.close();

	}

}
