package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex5_10 {
	static int n;
	static int m;
	static int[][] map;
	static int[][] visited;
	static int dx[] = { -1, 0, 0, 1 };
	static int dy[] = { 0, -1, 1, 0 };
	static int cnt=0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		visited = new int[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String tmp=st.nextToken();
			for (int j = 0; j < m; j++) {
				map[i][j]=tmp.charAt(j)-'0';
			}
		}

		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j]==0 && visited[i][j]==0) {
					dfs(i,j);
					cnt+=1;
				}
			}
		}
		System.out.println(cnt);
	}

	static void dfs(int x, int y) {
		visited[x][y] = 1;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(nx>=0 && ny>=0 && nx<n && ny<m) {
				if(map[nx][ny]==0 && visited[nx][ny]==0) {
					dfs(nx,ny);
				}
			}
		}
	}
}
