import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n, s, count=0;
	static int[] arr;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		s=Integer.parseInt(st.nextToken());
		arr=new int[n];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr); //dfs�����
		
		check(0,0);
		if(s==0) count--; //s�� 0�϶��� 1 �������
		bw.append(count+"\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public static void check(int d, int sum) {
		if(d == n) {
			if(sum == s) count++;
			return;
		}

		check(d+1, sum + arr[d]); //�ڱ⸦ ����
		check(d+1, sum); //�ڱ⸦ �ȴ���
	}
		

}
