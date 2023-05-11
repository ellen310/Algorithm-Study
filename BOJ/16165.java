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
	static HashMap<String,String> info = new HashMap<>(); //�ɱ׷� ����
	static String quiz[][]; //���� ����
	static ArrayList<String> memArr=new ArrayList<String>();
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		quiz=new String[M][2];
		
		while(N-->0) { //�ɱ׷� ���� �Է¹ޱ�
			String GroupName=br.readLine();
			int member = Integer.parseInt(br.readLine());
			while(member-->0) {
				info.put(br.readLine(), GroupName); 
			}
		}
		for(int i=0;i<M;i++) { //���� ���� �Է¹ޱ�
			String name=br.readLine();
			String type=br.readLine();
			quiz[i][0]=name;
			quiz[i][1]=type;
		}
		
		for(int i=0;i<M;i++) { //���� Ǯ��
			print(quiz[i][0],quiz[i][1]);
		}
		bw.append(result+"");
		bw.flush();bw.close();br.close();
	}

	public static void print(String quizName, String quizType) { //������� �Լ�
		if(quizType.equals("1")) { //1�̸� info�� sana�� key�� value(twice)�� ���
			result+=info.get(quizName)+"\n";  
		}else { //0�̸� value�� twice�ξֵ� ��. 
			info.forEach((key, value)->func0(quizName, key,value));
			Collections.sort(memArr);
			for(int i=0 ; i<memArr.size() ; i++) result+=memArr.get(i)+"\n";
			memArr=new ArrayList<String>();
		}
	}
	
	public static void func0(String qN, String key,String value) { //twice�� info�� ��� value�� �� ���� �Ѿ���� üũ
		if(value.equals(qN)) {
			memArr.add(key); //�������� �ϱ����� ArrayList�� ����� �̸��� ����
		}
	}
	
	
}
