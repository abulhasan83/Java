package org.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class User extends UserDefPojo {
public static void main(String[] args) {
	Map<Integer,UserDefPojo> u = new LinkedHashMap<Integer,UserDefPojo>();
	UserDefPojo p = new UserDefPojo();
	p.setUserId(100);
      p.setUserName("Abul");
      p.setUserPhNo(87341287147l);

UserDefPojo p1 = new UserDefPojo();
   p1.setUserId(200);
   p1.setUserName("Arun");
   p1.setUserPhNo(9965071224l);
	
	u.put(1,p);
	u.put(2,p1);
	Set<Entry<Integer, UserDefPojo>> entrySet = u.entrySet();
for(Entry<Integer,UserDefPojo> x: entrySet)
	{
		System.out.println(x.getValue().getUserId());
		System.out.println(x.getValue().getUserName());
		System.out.println(x.getValue().getUserPhNo());
	}
for(Entry<Integer, UserDefPojo> x1: entrySet)
{
	Integer key = x1.getKey();
	System.out.println(key);

}
}
}

