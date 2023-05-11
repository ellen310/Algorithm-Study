import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		int t=Integer.parseInt(br.readLine());
		
		boolean[] prime=new boolean[10001];
		for(int i=0; i<prime.length ;i++) prime[i]=true;
		prime[0]=prime[1]=false;
		
		for(int i=2;i<=10000;i++) { //�����佺�׳׽� ü
			for(int j=2;i*j<=10000;j++) {
				prime[i*j]=false;
			}
		}
		
		
		while(t-- >0) {
			int n=Integer.parseInt(br.readLine());
			
			for(int i=0;i<n/2;i++) {
				if(prime[(n/2)-i]&&prime[(n/2)+i]) { //���ݿ��� ������ 1�� ���ذ���, ������ 1�� �����鼭 �Ѵ� �Ҽ��ζ��� ã��
					bw.append(((n/2)-i)+" "+((n/2)+i)+"\n");
					bw.flush();
					break;
				}
			}
		}
		
		
		
		
		bw.close();
		br.close();
	}

}
