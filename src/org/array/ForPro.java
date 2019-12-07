package org.array;
import java.util.*;
public class ForPro {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	List<Integer> li = new ArrayList<Integer>();
	System.out.println("Enter no of values:");
	int n = s.nextInt();
	for(int i=0;i<n;i++)
	{
		int f = s.nextInt();
		li.add(f);
	}
	for(int i=0;i<n;i++)
	{
		int d = li.get(i);
	System.out.println(d);
}
	for(int g:li) {
		System.out.println(g);
}
}
}