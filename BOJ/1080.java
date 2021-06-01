import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int A[][];
	static int B[][];
	static int cnt=0;

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		A=new int[N][M];
		B=new int[N][M];
		
		for(int i=0;i<N;i++) { 
			String str=br.readLine();
			for(int j=0;j<M;j++) {
				A[i][j]=str.charAt(j)-'0';
			}
		}
		for(int i=0;i<N;i++) { 
			String str=br.readLine();
			for(int j=0;j<M;j++) {
				B[i][j]=str.charAt(j)-'0';
			}
		}
		
		
		for(int i=0;i<=N-3;i++) {
			for(int j=0;j<=M-3;j++) {
				if(A[i][j]!=B[i][j]) {
					change(i,j); //다르면 '변환' 
				}
			}
		}
		
        if(Arrays.deepEquals(A, B)) bw.append(cnt+""); //변환을 마쳤을 때 A와 B가 같은지 체크
        else bw.append("-1");
        bw.flush();bw.close();br.close();
		
	}
	
	public static void change(int i, int j) { //해당위치부터 3*3개 변환
		for(int k=i;k<i+3;k++) {
			for(int l=j;l<j+3;l++) {
				if(A[k][l]==1) A[k][l]=0;
				else A[k][l]=1;
			}
		}
		cnt++;
	}

}
