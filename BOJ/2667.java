import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	static int N;
	static int map[][];
	static boolean visited[][];
	static int pos[][]= {{-1,0},{1,0},{0,-1},{0,1}}; //상,하,좌,우
	static int cnt;

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		N=Integer.parseInt(br.readLine());
		map=new int[N][N];
		visited=new boolean[N][N];
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			for(int j=0;j<N;j++) {
				map[i][j]=str.charAt(j)-'0';
			}
		}
		
		ArrayList<Integer> al=new ArrayList<>(); //단지별 집 갯수를 add할거임
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j]==1 && !visited[i][j]) { //map 전부 돌면서 몇개의 단지인지, 단지안에 집 몇갠지 볼 거임. 단,방문 안한 곳만
					cnt=0; //집 갯수
					DFS(i,j);
					al.add(cnt);
				}
			}
		}
		
		bw.append(al.size()+"\n");
		Collections.sort(al);
		for(Integer house : al) {
			bw.append(house+"\n");
		}
		bw.flush();bw.close();br.close();

	}
	
	static void DFS(int row, int col) {
		cnt++;
		visited[row][col] = true;
		for(int i=0;i<4;i++) { //상하좌우 인접한 것
			int adRow= row + pos[i][0];
			int adCol= col + pos[i][1];
			
			if(adRow>=0&&adRow<N && adCol>=0&&adCol<N) { //배열을 벗어나지 않게 체크	
				if(map[adRow][adCol]==1 && !visited[adRow][adCol]) {//연결되어있는데 방문안했다면
					DFS(adRow, adCol);
				}
			}
			
		}
	}

}
