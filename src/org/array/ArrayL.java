package org.array;

import java.util.*;
import java.util.Scanner;

public class ArrayL {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	List li = new Vector();
	for(int i=0;i<=7;i++)
	{
		int a = s.nextInt();
	    li.add(a);
}
	System.out.println(li);
	System.out.println(li.size());	
	
}
}
