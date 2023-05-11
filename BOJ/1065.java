import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count=99; //�Ѽ�����. n�� 100���� ������ ������ n��ŭ �Ѽ��ϱ� �׷��� �����Ұ�. 100���� ũ�� �ּ�99���� ŭ 
		int n=Integer.parseInt(br.readLine());
		
		if(n<100) {
			count=n;
		}else {
			if(n==1000) n=999;
			
			for(int i=100;i<=n;i++) {
				int n100=i/100; //100���ڸ� ��
				int n10=(i-n100*100)/10; //10���ڸ� ��
				int n1=i%10; //1���ڸ� ��
				
				if((n100-n10)==(n10-n1)) count++;
			}
		}
		
		bw.append(count+"\n");
		bw.flush();
		br.close();
		bw.close();
	}

}
