package org.array;

public class Student extends Studcons {
	Student()
	{
         super(23,"Abul");
         System.out.println("CSE Department");
}
	Student(char c)
	{
		this();
		System.out.println("Section:"+c);
	}
public static void main(String[] args) {
	new Student('A');
	
}

}
