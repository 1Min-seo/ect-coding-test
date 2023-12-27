package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex5_11 {
	static int n;
	static int m;
	static int [][]map;
	static int [][]visited;
	static int []dx= {-1,0,0,1};
	static int []dy= {0,-1,1,0};

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		map=new int[n][m];
		visited=new int[n][m];
		
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine());
			String tmp=st.nextToken();
			for(int j=0; j<m; j++) {
				map[i][j]=tmp.charAt(j)-'0';
			}
		}
		
		bfs(0,0);
		System.out.println(visited[n-1][m-1]);
	}
	
	static void bfs(int x, int y) {
		Queue<Node> queue=new LinkedList<>();
		queue.add(new Node(x,y));
		visited[x][y]=1;
		
		while(!queue.isEmpty()) {
			Node xNode=queue.poll();
			
			for(int i=0; i<4; i++) {
				int nx=xNode.x+dx[i];
				int ny=xNode.y+dy[i];
				
				if(nx>=0 && ny>=0 && nx<n& ny<m) {
					if(map[nx][ny]==1 && visited[nx][ny]==0) {
						queue.add(new Node(nx,ny));
						visited[nx][ny]= visited[xNode.x][xNode.y]+1;
					}
				}
			}			
		}	
	}
	
	static class Node{
		int x;
		int y;
		Node(int x, int y){
			this.x=x;
			this.y=y;
		}
	}

}
