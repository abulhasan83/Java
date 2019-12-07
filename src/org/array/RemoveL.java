package org.array;
import java.util.*;
public class RemoveL {
	public static void main(String[] args) {
		List li= new Vector(); 
Scanner s = new Scanner(System.in);
System.out.println("Enter no of values");
int n = s.nextInt();
for(int i=0;i<n;i++)
{
	int g = s.nextInt();
	li.add(g);
}
//li.remove(2);
//System.out.println(li);

//adding the value 50 in the 2nd index
li.add(2,50);
System.out.println(li);
	}
}
