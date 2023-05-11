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
		
		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		
		int house[]= new int[n];
		for(int i=0;i<n;i++) house[i]=Integer.parseInt(br.readLine());
		Arrays.sort(house);
		
		int low=1;
		int high=house[n-1]-house[0];
		int distance=0; 
		int result=0; 
		
		while(low<=high) {
			int mid=(low+high)/2;
			int start=house[0];
			int cCount=1;
			
			for(int i=1;i<n;i++) {
				distance=house[i]-start;
				if(distance>=mid) { //������ ��ġ ���� ������Ű�ٰ� �Ÿ��� �ʹ�(�ݺ��� ��) �־����ٸ� -> ������ ��ġ, start�� ���������� �ٲ� ���� �ٽ� üũ�ϸ� ��ġ
					cCount++;
					start=house[i];
				}
			}
			
			if(cCount>=c) { //������ �ӽ÷� ��ġ�� ������  �� > ��ġ�Ϸ��� ������ �� ==>(���� ������) ���� ����
				result=mid; 
				low = ++mid;
			}else { //�������� �� ������ �����Ⱑ ��ġ�ƴ� ==> ���� ����
				high = --mid;
			}
		}
		
		bw.append(result+"");
		bw.flush();bw.close();br.close();

	}

}
