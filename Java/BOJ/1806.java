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
		int s=Integer.parseInt(st.nextToken());
		
		int[] nArr=new int[n];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<nArr.length;i++) nArr[i]=Integer.parseInt(st.nextToken());

		int length=n, start=0, end=0, sum=0, check=0;
		
		
		for(start=0;start<n;start++) { 
			while(sum<s && end!=n) { //s���� ���ų� Ŀ�������� end�� �������Ѱ��� ���ӵ� ���� ������
				sum+=nArr[end];
				end++;
			}
			if(sum>=s) {
				check=1;
				if((end-start)<length) length=end-start; //while�� ����=> s ���ų� Ŀ��. �̶� ����ª���� üũ
			}
			sum-=nArr[start]; 
		}
		
		if(check==1) bw.append(length+"");
		else bw.append("0");
		bw.flush();
		bw.close();
		br.close();
	}

}
