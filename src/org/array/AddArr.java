package org.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddArr {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<8;i++)
		{
			int f = sc.nextInt();
			li.add(f);
		}
		li.add(2,50);
		System.out.println(li);
			
	}
}
