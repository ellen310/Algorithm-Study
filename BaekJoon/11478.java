import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str=br.readLine();
		int cnt=0;
        String check1,check2;
		
		for(int i=str.length()-1;i>=0;i--){
            for(int j=i;j<str.length();j++){
                check1=str.substring(i+1);
                check2=str.substring(i,j+1);
                if(check1.contains(check2)) continue;
                else cnt++;    
            }
        }
		
		bw.append(cnt+"");
		bw.flush();br.close();bw.close();

	}

}
