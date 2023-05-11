import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(br.readLine());
		
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}

		int subMin=1000;
		int minItem=0;
		for(int item : arr) {
			if(subMin > Math.abs(B-item)){
				subMin=Math.abs(B-item);
				minItem=item;
			}
		}
		
		subMin=Math.min(Math.abs(A-B), Math.abs(B-minItem)+1);
		bw.append(subMin+"");
		
		bw.flush();bw.close();br.close();
	
	
		
		
	}

}
