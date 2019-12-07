package org.array;

import java.util.*;
import java.util.Map.Entry;;
public class MapEn {
public static void main(String[] args) {
	Map<Integer,String> m = new LinkedHashMap<Integer,String>();
	m.put(100, "Abul");
	m.put(200, "gopi");
	m.put(300, "Anwar");
	m.put(400, "Balaji");
	m.put(500, "ggggg");
	System.out.println(m);
	System.out.println(m.keySet());
	System.out.println(m.values());
	Set<Entry<Integer,String>> es = m.entrySet();
	for(Entry<Integer,String> s:es)
	{
		System.out.println(s);
	}
}
}
