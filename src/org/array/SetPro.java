package org.array;

import java.util.*;

public class SetPro {
public static void main(String[] args) {
	Set<Integer> l1 = new HashSet<Integer>();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(60);
	System.out.println(l1);
	Set<Integer> l2 = new TreeSet<>();
    l2.add(30);
    l2.add(60);
    l2.add(70);
    l2.add(20);
    System.out.println(l2);
    l2.addAll(l1);cc
    System.out.println(l2);
   // l2.retainAll(l1);
   // System.out.println(l2);
   // l2.removeAll(l1);
   // System.out.println(l2);
    for(Integer i:l2)
    {
    	System.out.println(i);
    }
}
}
