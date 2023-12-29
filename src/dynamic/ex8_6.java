package dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex8_6 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int arr[]=new int[n];
		int dp[]=new int[n];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		dp[0]=arr[0];
		dp[1]=Math.max(arr[0], arr[1]);
		for(int i=2; i<n; i++) {
			dp[i]=Math.max(dp[i-1], arr[i]+dp[i-2]);
		}
		
		int result=0;
		for(int i=0; i<n; i++) {
			result=Math.max(result, dp[i]);
		}
		
		System.out.println(result);
	}

}

