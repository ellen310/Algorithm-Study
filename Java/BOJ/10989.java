import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		int[] array=new int[10001];
		
		for (int i = 0; i < n; i++) {
            array[Integer.parseInt(br.readLine())]++; //ī���� ����. (�ε���==�Էµȼ���)�� ��ġ�� ++   : [1]���� 1�� ����, [2]���� 2�� ����..
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
