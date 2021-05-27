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
		if(cnt==N/2) { //한쪽 팀 인원 다 뽑음: 팀 능력치 계산
			int team1=0;
			int team2=0;
			
			for(int i=0;i<N;i++) { //true인 애 골라놔. 걔를 기준으로 j를 돌려(true인 애는 제외해.) stat[ture][j]을 계속 더해줘
				if(picked[i]) { //team1의 팀능력치 구함
					for(int j=0;j<N;j++) {
						if(j==i) continue;
						if(picked[j]) team1 += stat[i][j] + stat[j][i];
					}
				}else { //team2의 팀능력치 구함
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
