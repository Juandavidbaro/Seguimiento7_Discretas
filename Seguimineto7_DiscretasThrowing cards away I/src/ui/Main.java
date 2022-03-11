package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0)
				break;
			
			Queue<Integer> q = new LinkedList<>();
			
			for (int i = 1; i <= n; i++) {
				q.add(i);
			}
			
			ArrayList<Integer> dis = new ArrayList<>();
			int rem = 0;
			
			while(true){
				int num1 = q.poll();
				if(q.isEmpty()){
					rem = num1;
					break;
				}
				
				int num2 = q.poll();
				
				dis.add(num1);
				q.add(num2);
			}
			
			out.print("Discarded cards:");
			for (int i = 0; i < dis.size() - 1; i++) {
				out.print(" " + dis.get(i) + ",");
			}
			if(dis.size() > 0)
				out.print(" " + dis.get(dis.size() - 1));
			out.println();
			
			out.printf("Remaining card: %d\n", rem);
		}
		
		out.flush();
		out.close();
	}
}