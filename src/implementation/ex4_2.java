package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex4_2 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		int cnt=0;
		
		for(int h=0; h<n+1; h++) {
			for(int m=0; m<60; m++) {
				for(int s=0; s<60; s++) {
					if(h%10==3 || m/10==3 || m%10==3 || s/10==3 || s%10==3) cnt+=1;
				}
			}
		}
		System.out.println(cnt);

	}

}
/*
 * 00시 00분 00초 부터 5시 59분 59초까지의 시각 중에서
 * 3이 하나라도 포함되는 모든 경우의 수
 * 
*/
