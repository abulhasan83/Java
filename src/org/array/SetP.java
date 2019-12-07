package org.array;
import java.util.*;
public class SetP {
public static void main(String[] args) {
	Set<Integer>s = new LinkedHashSet<>();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(10);
	s.add(50);
	System.out.println(s);
	for(Integer i:s)
	{
		System.out.println(i);
}
	System.out.println(s.size());
	
}
}