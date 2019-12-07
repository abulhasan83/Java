package org.array;
import java.util.*;
public class VectorPro {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List v = new Vector();
		System.out.println("Enter no of values:");
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			int f = s.nextInt();
		    v.add(f);
	}
	     	System.out.println(v);
	     	System.out.println(v.size());
}
}
