package org.array;
import java.util.*;
public class Studcons {
Studcons()
{
	System.out.println("He/She is a student from Anna Univ");
}

Studcons(int id,String name)
{
	this();
	System.out.println("The student id is:"+id);
	System.out.println("Student name is:"+name);
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the student details");
	int i = s.nextInt();
	String g = s.next();
	//Studcons c1 = new Studcons();
	Studcons c = new Studcons(i,g);
	
}
}
