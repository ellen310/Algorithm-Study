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
		
		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		
		int house[]= new int[n];
		for(int i=0;i<n;i++) house[i]=Integer.parseInt(br.readLine());
		Arrays.sort(house);
		
		int low=1;
		int high=house[n-1]-house[0];
		int distance=0; 
		int result=0; 
		
		while(low<=high) {
			int mid=(low+high)/2;
			int start=house[0];
			int cCount=1;
			
			for(int i=1;i<n;i++) {
				distance=house[i]-start;
				if(distance>=mid) { //공유기 설치 폭을 증가시키다가 거리가 너무(반보다 더) 멀어졌다면 -> 공유기 설치, start를 지금집으로 바꿔 폭을 다시 체크하며 설치
					cCount++;
					start=house[i];
				}
			}
			
			if(cCount>=c) { //위에서 임시로 설치한 공유기  수 > 설치하려는 공유기 수 ==>(폭이 좁으면) 폭을 넓힘
				result=mid; 
				low = ++mid;
			}else { //생각보다 더 띄엄띄엄 공유기가 설치됐다 ==> 폭을 좁힘
				high = --mid;
			}
		}
		
		bw.append(result+"");
		bw.flush();bw.close();br.close();

	}

}
