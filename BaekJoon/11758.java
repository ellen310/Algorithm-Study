import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int xy[][]=new int[3][2];
		
		for(int i=0;i<3;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<2;j++) {
				xy[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		int result= ( xy[0][0]*xy[1][1] + xy[1][0]*xy[2][1] + xy[2][0]*xy[0][1] )
					- ( xy[0][1]*xy[1][0] + xy[1][1]*xy[2][0] + xy[2][1]*xy[0][0] );
		
		if(result < 0) bw.append(-1+"");
        else if(result > 0) bw.append(1+"");
        else bw.append(0+"");
		
		bw.flush();bw.close();br.close();
	}

}
