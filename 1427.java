import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String n=br.readLine();
		
		int[] arr=new int[n.length()];
		
		for(int i=0;i<n.length();i++) {
			arr[i]=Integer.parseInt(n.charAt(i)+"");
		}
		
		Arrays.sort(arr);
		
		for(int i=n.length()-1;i>=0;i--) bw.append(arr[i]+"");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
