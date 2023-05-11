import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static int result=2147483647;
	public static int N;
	public static int stat[][];
	public static boolean picked[];

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		stat=new int[N][N];
		picked=new boolean[N];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				stat[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		Pick(0,0);
		
		bw.append(result/2+"");
		bw.flush();bw.close();br.close();

	}
	
	
	public static void Pick(int playerNum, int cnt) {
		if(cnt==N/2) { //���� �� �ο� �� ����: �� �ɷ�ġ ���
			int team1=0;
			int team2=0;
			
			for(int i=0;i<N;i++) { //true�� �� ����. �¸� �������� j�� ����(true�� �ִ� ������.) stat[ture][j]�� ��� ������
				if(picked[i]) { //team1�� ���ɷ�ġ ����
					for(int j=0;j<N;j++) {
						if(j==i) continue;
						if(picked[j]) team1 += stat[i][j] + stat[j][i];
					}
				}else { //team2�� ���ɷ�ġ ����
					for(int j=0;j<N;j++) {
						if(j==i) continue;
						if(!picked[j]) team2 += stat[i][j] + stat[j][i];
					}
				}
			}
			
			result=Math.min(result, Math.abs(team1-team2));
		}
		
		for(int i=playerNum+1;i<N;i++) {
			if(!picked[i]) {
				picked[i]=true;
				Pick(i,cnt+1);
				picked[i]=false;
			}
		}
	}
	

}
