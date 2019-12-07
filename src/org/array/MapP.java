package org.array;
import java.util.*;
public class MapP {
public static void main(String[] args) {
	Map<Integer,String> mp = new HashMap<>();
	mp.put(100, "abul");
	mp.put(101, "Anwar");
	mp.put(103, "Balaji");
	mp.put(103,"Gopi");
	System.out.println(mp);
	Collection<String> s = mp.values();
	System.out.println(s);
	
	Collection<Integer> g = mp.keySet();
	System.out.println(g);
	
	String t=mp.get(100);
	System.out.println(t);
	
	
}
}
