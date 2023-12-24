package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex4_1 {
	static int x=1;
	static int y=1;
	static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { -1, 1, 0, 0 };
	static String moveTypes[]= {"L", "R", "U", "D"};
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int nx=x;
		int ny=y;
		
		while(st.hasMoreTokens()) {
			String plan=st.nextToken();
			for(int i=0; i<4; i++) {
				if(plan.equals(moveTypes[i])) {
					nx=x+dx[i];
					ny=y+dy[i];
				}
			}
			if(nx<1 || ny<1 || nx>n || ny>n) continue;
			x=nx;
			y=ny;
		}
		
		System.out.println(x+" "+y);
		
		
	}
}
