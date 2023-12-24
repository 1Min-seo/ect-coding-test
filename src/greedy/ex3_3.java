package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex3_3 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		int num=0;
		int result=0;
		
		for(int i=0; i<n; i++) {
			int min=10001;  
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				num=Integer.parseInt(st.nextToken());
				min=Math.min(min, num);
			}
			result=Math.max(min, result);
		}
		
		System.out.println(result);
	}

}
