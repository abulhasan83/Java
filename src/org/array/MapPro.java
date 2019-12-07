package org.array;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPro {
public static void main(String[] args) {
	Map <Integer,String> mp = new HashMap<Integer,String>();
	mp.put(1, "Abul");
	mp.put(2, "Arun");
	mp.put(3, "Anwar");
	mp.put(4, "Hasan");
	System.out.println(mp);
	Set<Integer> key = mp.keySet();
	Collection<String> val = mp.values();
	for(Object k: key) {
		System.out.println(k);
	}
	for(Object v: val) {
		System.out.println(v);
	}
	
	Set<Entry<Integer, String>> es = mp.entrySet();
	for(Entry<Integer,String>eps: es) {
		Integer key2 = eps.getKey();
		System.out.println(key2);
		String value = eps.getValue();
		System.out.println(value);
	}
	
	String replace = mp.replace(2,"Ranjan");
	System.out.println(replace);
	System.out.println(mp);
	
	mp.replace(4, "Hasan", "Julai");
	System.out.println(mp);
	String remove = mp.remove(2);
	System.out.println(remove);
	
}
}
