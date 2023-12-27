package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


public class ex6_11 {
	static class Student implements Comparable<Student>{
		String name;
		int score;
		
		public Student(String name, int score) {
			this.name=name;
			this.score=score;
		}
		
		public String getName() {
			return this.name;
		}
		
		public int getScore() {
			return this.score;
		}
		
		@Override
		public int compareTo(Student other) {
			if(this.score<other.score) {
				return -1;
			}
			return 1;
		}
	}

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		List<Student> students=new ArrayList<>();
		for(int i=0; i<n; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String name=st.nextToken();
			int score=Integer.parseInt(st.nextToken());
			
			students.add(new Student(name, score));
		}
		
		Collections.sort(students);
		
		for(int i=0; i<students.size(); i++) {
			System.out.print(students.get(i).getName()+" ");
		}
	}

}
