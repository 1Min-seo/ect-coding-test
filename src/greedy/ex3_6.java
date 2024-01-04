package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex3_6 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		int result=str.charAt(0)-'0';
		
		for(int i=1; i<str.length(); i++) {
			int num=str.charAt(i)-'0';
			if(result<=1 || num<=1) {
				result+=num;
			}else {
				result*=num;
			}
		}
		System.out.println(result);
	}

}
	