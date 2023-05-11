import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int sum=0, min=0;
		boolean[] prime=new boolean[n+1]; //�Ҽ��� true, ���� true�� ���
		
		for(int i=0;i<prime.length;i++) prime[i]=true;
		
		
		prime[0]=prime[1]=false; //0�� 1 �� �Ҽ��� �ƴ�
		
		for(int i=2;i<n;i++) { //�����佺�׳׽��� ü
			for(int j=2;j*i<=n;j++) {
				prime[i*j]=false;
			}
		}
		
		
		for(int i=m;i<=n;i++) {
			if(prime[i]) sum+=i; //�Ҽ��̸� ����
		}
		
		for(int i=m;i<=n;i++) {
			if(prime[i]) {
				min+=i; //�Ҽ��̸� ����
				break;
			}
		}
		
		if(sum==0) {
			bw.append(-1+"\n");
		}else {
			bw.append(sum+"\n");
			bw.append(min+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
