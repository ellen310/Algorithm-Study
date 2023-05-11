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
		
		for(start=0;start<n;start++) { //��������
			while(sum<m && end!=n) { //sum�� ���Ϸ��°����� ������ end�� ��ġ�� �������Ѱ��� �� ����
				sum+=nArr[end];
				end++;
			}
			if(sum==m) cnt++; //sum�� ���Ϸ��°��� �������� cnt++. 
			sum-=nArr[start]; //������ ���� sum�� m���� Ŀ���״ϱ�(sum==m�̾����ϱ� ����� �����ص� ���Ϸ��°����� ŭ) start�� 1�� ������ų�Ŷ� �����ϰ� sum���� start�� ����
		}
		
		bw.append(cnt+"");
		
		bw.flush();
		bw.close();
		br.close();

	}

}
