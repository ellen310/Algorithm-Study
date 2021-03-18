import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
	static String result="";
	static HashMap<String,String> info = new HashMap<>(); //걸그룹 정보
	static String quiz[][]; //퀴즈 정보
	static ArrayList<String> memArr=new ArrayList<String>();
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		quiz=new String[M][2];
		
		while(N-->0) { //걸그룹 정보 입력받기
			String GroupName=br.readLine();
			int member = Integer.parseInt(br.readLine());
			while(member-->0) {
				info.put(br.readLine(), GroupName); 
			}
		}
		for(int i=0;i<M;i++) { //퀴즈 정보 입력받기
			String name=br.readLine();
			String type=br.readLine();
			quiz[i][0]=name;
			quiz[i][1]=type;
		}
		
		for(int i=0;i<M;i++) { //퀴즈 풀기
			print(quiz[i][0],quiz[i][1]);
		}
		bw.append(result+"");
		bw.flush();bw.close();br.close();
	}

	public static void print(String quizName, String quizType) { //정답출력 함수
		if(quizType.equals("1")) { //1이면 info의 sana란 key의 value(twice)를 출력
			result+=info.get(quizName)+"\n";  
		}else { //0이면 value가 twice인애들 다. 
			info.forEach((key, value)->func0(quizName, key,value));
			Collections.sort(memArr);
			for(int i=0 ; i<memArr.size() ; i++) result+=memArr.get(i)+"\n";
			memArr=new ArrayList<String>();
		}
	}
	
	public static void func0(String qN, String key,String value) { //twice와 info의 모든 value가 한 번씩 넘어오며 체크
		if(value.equals(qN)) {
			memArr.add(key); //오름차순 하기위해 ArrayList에 멤버들 이름을 저장
		}
	}
	
	
}
