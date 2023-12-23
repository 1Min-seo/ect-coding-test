package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex3_1 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int []coin= {500,100,50,10};
		int result=0;
		
		for(int i=0; i<4; i++) {
				result+=(N/coin[i]);
				N%=coin[i];
			}
		
		System.out.println(result);
	}

}

/*
 * 거스름돈
 * 카운터에 사용하는 동전 : 500	100	50	10
 * 거슬러 줘야 하는 동전의 최소 개수
 * 
 * 단, 거슬러 줘야 할 돈 N은 항상 10 배수
 * 
 * 
*/
