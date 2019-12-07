package org.array;

import java.util.LinkedList;
import java.util.List;

public class UserDefList extends StudentPojo {
public static void main(String[] args) {
	List <StudentPojo> s = new LinkedList<StudentPojo>();
	StudentPojo ap = new StudentPojo();
	ap.setId(100);
	ap.setName("Abul");
	ap.setRegNo(82041178039l);
	
	StudentPojo ap1 = new StudentPojo();
	ap1.setId(20);
	ap1.setName("Hasan");
	ap1.setRegNo(82134039399l);
	
	s.add(ap);
	s.add(ap1);
	for(int i=0;i<s.size();i++) {
		System.out.println(s.get(i).getId());
		System.out.println(s.get(i).getName());
		System.out.println(s.get(i).getRegNo());
	}
	
	for(StudentPojo p: s) {
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getRegNo());
		
	}
}
}
	

	