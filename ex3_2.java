package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex3_2 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		int []arr=new int[n];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int max1=arr[n-1];
		int max2=arr[n-2];
		int cnt=0;
		int sum=0;
		
		while(true) {
			for(int i=0; i<k; i++) {
				if(cnt==m) break;
				
				cnt+=1;
				sum+=max1;
			}
			if(cnt==m) break;
			cnt+=1;
			sum+=max2;
		}
		
		System.out.println(sum);
	}
}


/*
 * 큰 수의 법칙
 * n: 입력 받을 수 개수
 * m: 더하는 행위 수
 * k: k번을 초과해서 연속으로 더할 수 없음
 * 
 * (1)
 * 5	8	3
 * 2 4 5 4 6
 * 
 * 6 5 4 4 2
 * 6+6+6+5+6+6+6+5
 * 
 * (2)
 * 5	7	2
 * 3 4 3 4 3
 * 
 * 4 4 3 3 3
 * 4+4+4+4+4+4+4
 * 
*/
