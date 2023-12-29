package dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex8_5 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int dp[]=new int[n+1];
		
		dp[0]=0;
		dp[1]=0;
		for(int i=2; i<=n; i++) {
			dp[i]=dp[i-1]+1;
			if(i%5==0) {
				dp[i]=Math.min(dp[i], dp[(i/5)]+1);
			}
			if(i%3==0) {
				dp[i]=Math.min(dp[i], dp[(i/3)]+1);
			}
			if(i%2==0) {
				dp[i]=Math.min(dp[i], dp[(i/2)]+1);
			}
		}
		System.out.println(dp[n]);
	}

}

/* 1로 만들기
 * 
 * 1) 5로 나누기
 * 2) 3로 나누기
 * 3) 2로 나누기
 * 4) 1빼기
 * 
 * dp[1]=0
 * dp[2]=1
 * dp[3]=1
 * dp[4]=dp[2]+1
 * dp[5]=1
 * 
 */
