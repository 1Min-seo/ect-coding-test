package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class ex5_2 {

	public static void main(String[] args) {
		Queue<Integer>queue=new LinkedList<>();
		
		 // 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
		queue.offer(5);
		queue.offer(2);
        queue.offer(3);
        queue.offer(7);
        queue.poll();
        queue.offer(1);
        queue.offer(4);
        queue.poll();
        
        while(!queue.isEmpty()) {
        	System.out.println(queue.poll());
        }

	}

}
