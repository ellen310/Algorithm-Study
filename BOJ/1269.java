import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int cnt=0;
		
		st=new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine());
		int arrA[]=new int[A];
		for(int i=0;i<A;i++) arrA[i]=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine());
		HashSet<Integer> arrB = new HashSet<>();  //contains를 쉽게 쓰기 위해서
		for(int i=0;i<B;i++) arrB.add(Integer.parseInt(st.nextToken()));
		
		for(int i=0;i<A;i++) {
			if(arrB.contains(arrA[i])) cnt++; 
		}
		
		bw.append(A+B-(cnt*2)+""); //전체 개수에서 중복되는 개수만큼 뺀다.
		bw.flush();bw.close();br.close();
	}

}
