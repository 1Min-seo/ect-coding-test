package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class ex6_12 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		Integer a[]=new Integer[n];
		Integer b[]=new Integer[n];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			b[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		
		for(int i=0; i<k; i++) {
			if(a[i]<b[i]) {
				int tmp=a[i];
				a[i]=b[i];
				b[i]=tmp;
			}
		}
		
		int sum=0;
		for(int i=0; i<n; i++) {
			sum+=a[i];
		}
		
		System.out.println(sum);
	}

}
