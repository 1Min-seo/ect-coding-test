package dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex8_8 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int dp[]=new int[m+1];
		for(int i=0; i<m+1; i++) {
			dp[i]=10001;
		}
		
		int coinType[]=new int[n];
		for(int i=0; i<n; i++) {
			coinType[i]=Integer.parseInt(br.readLine());
		}
		
		dp[0]=0;
		for(int i=2; i<m+1; i++) {
			for(int j=0; j<n; j++) {
				if(i-coinType[j]>=0) {
					dp[i]=Math.min(dp[i], dp[i-coinType[j]]+1);
				}
			}
		}
		
		if(dp[m]==10001) System.out.println(-1);
		else System.out.println(dp[m]);
	}

}
/*	 15
 * 2	3
 *
//1)화폐 2
 * dp[0]=0
 * dp[1]=10001
 * dp[2]=min(10001,dp[2-2]+1) = 1
 * dp[3]=min(10001,dp[3-2]+1) = 10001
 * dp[4]=min(10001,dp[4-2]+1) = 2
 * dp[5]=min(10001,dp[5-2]+1) = 10001
 * 
 * 2)화폐 3
 * dp[0]=0
 * dp[1]=10001
 * dp[2]=1
 * dp[4]=min(2, dp[4-3]+1)=2
 * .
 * .
 * 
 */


