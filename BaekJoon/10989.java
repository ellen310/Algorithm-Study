import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		int[] array=new int[10001];
		
		for (int i = 0; i < n; i++) {
            array[Integer.parseInt(br.readLine())]++; //카운팅 정렬. (인덱스==입력된숫자)인 위치에 ++   : [1]에는 1의 개수, [2]에는 2의 개수..
        }
		
		for(int i=1;i<array.length;i++) {
			while(array[i]!=0) { 
				bw.append(i + "\n");
				bw.flush();
				array[i]--;
			}
		}

		bw.close();
		br.close();
	}

}
