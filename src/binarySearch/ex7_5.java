package binarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex7_5 {
	static int binarySearch(int []a,int target) {
		int start=0;
		int end=a[a.length-1];
		
		while(start<= end) {
			int mid=(start+end)/2;
		
			if(a[mid]==target) return mid;
			else if(a[mid]<=target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int []a=new int[n];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		
		int m=Integer.parseInt(br.readLine());
		int []b=new int[m];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			b[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<m; i++) {
			int result = binarySearch(a,b[i]);
			if(result!=-1) System.out.print("yes ");
			else System.out.print("no ");
		}
	}

}
