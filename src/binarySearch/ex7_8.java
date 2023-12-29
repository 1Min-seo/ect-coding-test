package binarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex7_8 {
	static int binarySearch(int []a, int height) {
		int start=0;
		int end=a[a.length-1];
		int result=0;
		
		while(start<=end) {
			int change=0;
			int mid=(start+end)/2;
			
			for(int i=0; i<a.length; i++) {
				if(a[i]-mid>0) {
					change+=(a[i]-mid);
				}
			}
			if(change<height) {
				end=mid-1;
			}else {
				start=mid+1;
				result=mid;
			}
		}
		return result;
	}

	public static void main(String[] args)throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		int []a=new int[n];
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		//Arrays.sort(a);
		
		int result=binarySearch(a, m);
		System.out.println(result);

	}

}
/*
 * 10 15 17 19
 * start=0 end=19 mid=9
 * 1  6  8  10 =>25
 * 
 *start=10 end=19 mid=14
 *0   1   3   5 =>9
 *
 *start=15 end=19 mid=17
 *0  0  0  2 =>2
 *
 *start=15 end=16 mid=15
 *0  0  2  4 =>6 result=15
 *
 *start=16 end=16 mid=16
 *0  0  1  3 =>4
 *
 *
 */
