package org.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Listnew {
public static void main(String[] args) {
	List ls = new ArrayList();
	ls.add(100);
	Set s = new HashSet();
	s.add("abul");
	s.addAll(ls);
	Map<Integer,String> mm = new HashMap<>();
	String put = mm.put(102, "abul");
	System.out.println(mm);
	
}
}