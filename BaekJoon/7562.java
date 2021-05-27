import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int arr[][];
	static Queue<Point> q =new LinkedList<Point>();
	static int startX, startY, endX, endY;
	static int result=0;
	static int movable[][]= { {1,-2},{2,-1},{2,1},{1,2},{-1,2},{-2,1},{-2,-1},{-1,-2} };
	static int l=0;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T=Integer.parseInt(br.readLine());
		while(T-->0) {
			l=Integer.parseInt(br.readLine());
			arr=new int[l][l];
			q =new LinkedList<Point>();
			
			st=new StringTokenizer(br.readLine());
			startX=Integer.parseInt(st.nextToken());
			startY=Integer.parseInt(st.nextToken());
			st=new StringTokenizer(br.readLine());
			endX=Integer.parseInt(st.nextToken());
			endY=Integer.parseInt(st.nextToken());
			
			Point start = new Point(startX,startY);
			
	        q.add(start);
	        
			int result=BFS();
			bw.append(result+"\n");
		}
		
		bw.flush();bw.close();br.close();
	}
	
	public static int BFS() {
		
		while(!q.isEmpty()) {
			Point curP=q.poll();
			
			if(curP.x==endX && curP.y==endY) {
				return arr[curP.x][curP.y];
			}
			
			for(int i=0;i<8;i++) {
				int newX = curP.x + movable[i][0];
				int newY = curP.y + movable[i][1];
				Point newP=new Point(newX,newY);
				
				if(0<=newX&&newX<l && 0<=newY&&newY<l) {
					if(arr[newX][newY]==0) {
						arr[newX][newY]=arr[curP.x][curP.y]+1;
						q.add(newP);
					}
				}
			}
		}
		return -1;
	}
	
}

