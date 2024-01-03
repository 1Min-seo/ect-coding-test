package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex3_5 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int arr[]=new int[n];
		int cnt=0;
		int group=0;
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			cnt++;
			if(arr[i]<=cnt) {
				group++;
				cnt=0;
			}
		}
		System.out.println(group);

	}

}
