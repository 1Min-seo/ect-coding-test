package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex4_3 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int []dx= {-2,-2,-1,-1,1,1,2,2};
		int []dy= {-1,1,-2,2,-2,2,-1,1};
		
		String position=br.readLine();
		int x=position.charAt(1)-'0';
		int y=position.charAt(0)-'a'+1;
		int cnt=0;
		
		for(int i=0; i<8; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx<1 || ny<1 || nx>8 || ny>8) continue;
			cnt+=1;
		}
		
		System.out.println(cnt);
	}

}
