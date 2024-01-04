package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex3_7 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		int arr[]=new int[str.length()];
		arr[0]=str.charAt(0)-'0';
		int result0=0;
		int result1=0;
		
		if(arr[0]==0) result1+=1;
		else result0+=1;
		
		for(int i=1; i<str.length(); i++) {
			arr[i]=str.charAt(i)-'0';
		}
		
		for(int i=0; i<str.length()-1; i++) {
			if(arr[i]!=arr[i+1]) {
				if(arr[i+1]==0) result1+=1;
				else result0+=1;
			}
		}
		
		System.out.println(Math.min(result0, result1));
	}

}
/*
 *  0001100
 *  
 *  1)모두 1로 만들기
 *  2)모두 0으로 만들기
 *  3)연속으로 바뀔 때마다 카운트를 센다
 *  4)1번 방법과 2번 방법의 카운트 중에서 작은 것을 선택
 */
