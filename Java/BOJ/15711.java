import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static boolean[] primeCheck;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		primeCheck=new boolean[2000001];
		for(int i=0;i<primeCheck.length;i++) primeCheck[i]=true;
		
		primeCheck[0]=primeCheck[1]=false;
		for(int i=2;i<primeCheck.length;i++) { //route(����)���� ��� �Ҽ��� �̸� ���ص�. �̵� isPrime()�� Ȱ��. ���� �Ҽ��� �������� ū�ֵ� => ���س��� �Ҽ��� �������� �Ҽ��ƴ�.
			for(int j=2;i*j<primeCheck.length;j++) {
				primeCheck[i*j]=false;
			}
		}
		
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0) {
			st=new StringTokenizer(br.readLine());
			long a=Long.parseLong(st.nextToken());
			long b=Long.parseLong(st.nextToken());
			
			if(a+b==2) {
				bw.append("NO\n");
				bw.flush();
			}
			else if((a+b)%2==0) {
				bw.append("YES\n"); //�����忡 ����
				bw.flush();
			}
			else {
				bw.append(isPrime(a+b-2)?"YES\n":"NO\n"); //a,b�� ���� Ȧ���϶� ������ 2�� a+b-2�� ���� => ¦���� �Ҽ���2�ۿ� �����ϱ�. 
				bw.flush();
			}
		}
		
		bw.close();
		br.close();
	
	}
	
	public static boolean isPrime(long check) { 
		if(check<primeCheck.length) { //���ص� �Ҽ� ���������
			return primeCheck[(int)check];
		}else {
			for(int i=0;i<primeCheck.length;i++) {
				if(primeCheck[i]) { //�Ҽ��� check�� ������
					if(check%i==0) return false;
				}
			}
			return true; //check�� ���� �� �ִ� �Ҽ��� ���ٸ� check�� �Ҽ�
		}
	}

}
