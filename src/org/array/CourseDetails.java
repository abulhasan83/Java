package org.array;

import java.util.List;
import java.util.*;
public class CourseDetails {
public static void main(String[] args) {
	List<StudentDef> sd = new ArrayList();
	StudentDef s = new StudentDef();
	s.setPhno(9965071224l);
	s.setStudId(100);
	s.setName("Abulhasan");
	
	StudentDef s1 = new StudentDef();
	s1.setName("Bose");
	s1.setStudId(101);
	s1.setPhno(9004003922l);
	sd.add(s);
	sd.add(s1);
	//System.out.println(sd.get(0).getName());
	for(int i=0;i<sd.size();i++)
	{
		System.out.println(sd.get(i).getStudId());
		System.out.println(sd.get(i).getName());
		System.out.println(sd.get(i).getPhno());
	}
	
	for(StudentDef e:sd)
	{
		System.out.println(e.getStudId());
	System.out.println(e.getName());
	System.out.println(e.getPhno());
}
}
}
