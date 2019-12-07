package org.array;

public class A {
public A()
{
	this("JAVA");
	System.out.println("Default constructor");
	
}
A(int id){
	this(3456.5678f);
	System.out.println(id);
}
A(String name)
{
	this(12);
	System.out.println(name);
}
A(float sal)
{
	System.out.println(sal);
}
public static void main(String[] args) {
	A a = new A();
}
}
