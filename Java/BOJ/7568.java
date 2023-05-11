import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		
		int n=Integer.parseInt(br.readLine());
		int[][] arr=new int[n][n];
		int[] rank=new int[n];
		
		
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<2;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
			rank[i]=1;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][0]>arr[j][0]&&arr[i][1]>arr[j][1]) { //i�� ����, j�� �������� ���.
					rank[j]++; //i+1�� ����� ��ġ�� �� ������ j�� rank�� ++
				}else if(arr[i][0]<arr[j][0]&&arr[j][1]<arr[j][1]) {
					rank[i]++; //i�� ����� ��ġ�� �� ������ i�� rank�� ++
				}
			}
			
		}
		for(int item:rank) {
			bw.append(item+" ");
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}

}
