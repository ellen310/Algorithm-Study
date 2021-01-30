import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main( String[] args ) throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

		int n = Integer.parseInt( br.readLine() );
		ArrayList<Integer> nList=new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			nList.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(nList);
		
		for (int item : nList)
			bw.append( item + "\n" );
		bw.flush();

		br.close();
		bw.close();

	}

}
