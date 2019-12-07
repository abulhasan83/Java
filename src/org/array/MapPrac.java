package org.array;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapPrac {
	public static void main(String[] args) {
Map<String,Integer> mp = new HashMap<String,Integer>();
Scanner s = new Scanner(System.in);
System.out.println("Enter number of values:");
int n = s.nextInt();
System.out.println("Enter the String");
for(int i=1;i<=n;i++) { 
String ss  =s.nextLine();
mp.put(ss,i);
}
System.out.println(mp);
Set<String> key = mp.keySet();
Collection<Integer> values = mp.values();
for(String sk:key) {
	System.out.println(sk);
}
for (Integer integer : values) {
	System.out.println(integer);
	
}

	Set<Entry<String, Integer>> es = mp.entrySet();
	for(Entry<String,Integer> en: es) {
		System.out.println(en);
	}

}
}
