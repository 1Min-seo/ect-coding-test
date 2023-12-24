package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex3_4 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		int cnt=0;
		while(true) {
			if(n==1) break;
			if(n%k!=0) {
				n-=1;
				cnt+=1;
			}else {
				n/=k;
				cnt+=1;
			}	
		}
		
		System.out.println(cnt);
	}

}

/*
 * n이 1일 될 때까지의 최소 연산 개수 구하기
 * 1) n에서 1을 뺀다.
 * 2) n을 k로 나눈다.
 * 
 *  
*/
