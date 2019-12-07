package org.array;
import java.util.*;
public class Exp {
	public static void main(String[] args) {
		String s1 = null;
		System.out.println(10);
		System.out.println(12);
		try {
			System.out.println(4/0);
		}
		catch(Exception e)
		{
			System.out.println("Divide by 0");
		}
		try {
			System.out.println(s1.charAt(2));
		}
		catch(ArithmeticException e)
		{
	         System.out.println("Dont divide by zero");
		} 
		catch(NullPointerException w)
		{
			System.out.println("String is assigned null");
		}
finally
{
	System.out.println("Success");
}
}
}
