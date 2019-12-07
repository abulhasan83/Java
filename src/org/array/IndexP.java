package org.array;
import java.util.*;
import java.util.Scanner;

public class IndexP {
public static void main(String[] args) {
	List<Integer> li = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
		int f = sc.nextInt();
		li.add(f);
	}
	System.out.println(li.lastIndexOf(10));
	System.out.println(li.indexOf(10));
	
	
}
}
