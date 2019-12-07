package org.array;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefMap {
public static void main(String[] args) {
	Map <Integer,StudentPojo> mp = new HashMap<Integer,StudentPojo>();
	StudentPojo s = new StudentPojo();
	s.setId(10);
	s.setName("Abul");
	s.setRegNo(820417104002l);
	mp.put(1,s);
	
	StudentPojo s1 = new StudentPojo();
	s1.setId(20);
	s1.setName("Hasan");
	s1.setRegNo(801187346565l);
	
	mp.put(2, s1);
	Set<Entry<Integer, StudentPojo>> es = mp.entrySet();
	for(Entry<Integer,StudentPojo> et:es) {
		Integer key = et.getKey();
		System.out.println(key);
		int id = et.getValue().getId();
		System.out.println(id);
		System.out.println(et.getValue().getName());
		System.out.println(et.getValue().getRegNo());
	}
	
	Set<Integer> keySet = mp.keySet();
	System.out.println(keySet);
	boolean containsKey = mp.containsKey(1);
	System.out.println(containsKey);

}
}
