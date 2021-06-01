import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		int[] location=new int[n];
		int[] interval=new int[n-1];
		
		
		for(int i=0;i<location.length;i++) location[i]=Integer.parseInt(br.readLine());
		
		for(int i=0;i<interval.length;i++) interval[i]=location[i+1]-location[i];
		int gcd=interval[0];
		
		for(int i=0;i<interval.length;i++) gcd=GCD(gcd,interval[i]);
		
		int totalTree=((location[location.length-1]-location[0])/gcd)+1;
		int addTree=totalTree-location.length;
		bw.append(addTree+"");
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int GCD(int x, int y) { //유클리드 호제법
		if(y==0) return x;
		else {
			int r=x%y;
			return GCD(y,r);
			
		}
	}

}
