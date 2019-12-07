package org.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap {
	static int  x=0;
public static void main(String[] args) {
	List l1 = new ArrayList();
	l1.add(10);
	l1.add("abul");
	l1.add(10200l);
	l1.add(300);
	l1.add(300);
	
	Map m = new HashMap();
	
	for(int i=0;i<l1.size();i++) {
		m.put(++x, l1.get(i));
	
	
}
	System.out.println(m);
}
}
