package org.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayC {
public static void main(String[] args) {
	List l1 = new ArrayList();
	l1.add(10);
	l1.add("Abul");
	l1.add(9965071224l);
	l1.add(20);
	l1.add(300);
	System.out.println(l1);
	l1.add(5, 20);
	l1.add(300);
	Set s = new HashSet();
   	s.addAll(l1);
   	System.out.println(s);
   
   	for(int i=0;i<l1.size();i++){
   		System.out.println(l1.get(i));
   	}
	
   	int lastIndexOf = l1.lastIndexOf(300);
   	System.out.println(lastIndexOf);
   	
}
}
