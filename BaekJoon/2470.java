import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		
		int n=Integer.parseInt(br.readLine());
		int start=0, end=n-1;
		long sum=0;
		long[] min=new long[2]; //최소인 짝을 저장
		min[0]=1000000000; min[1]=1000000000;
		long[] nArr=new long[n];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<nArr.length;i++) nArr[i]=Integer.parseInt(st.nextToken());
		
		Arrays.sort(nArr);
		
		while(start<end) {
			sum=nArr[start]+nArr[end];
			if(Math.abs(sum)<Math.abs(min[0]+min[1])) {//합의 절댓값이 작을수록 0에 가깝다
				min[0]=nArr[start];
				min[1]=nArr[end];
			}
			else if(sum>0) end--;
			else start++;
		}
		
		bw.append(min[0]+" "+min[1]);
		bw.flush();
		bw.close();
		br.close();
	}

}
