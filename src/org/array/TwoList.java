package org.array;
import java.util.*;
public class TwoList {
	public static void main(String[] args) {
List l1 = new ArrayList();
List l2 = new LinkedList();
Scanner s = new Scanner(System.in);
System.out.println("Enter nos in List1");
int n = s.nextInt();
for(int i=0;i<n;i++)
{
	int f =s.nextInt();
	l1.add(f);
}
System.out.println(l1);
System.out.println("Enter nos in list2:");
int n1 = s.nextInt();
for(int i=0;i<n1;i++)
{
	int g = s.nextInt();
    l2.add(g);
	}
	System.out.println(l2);
	
	for(int i=0;i<l1.size();i++)
		for(int j=i+1;j<l2.size();j++)
		{
			if(l1.get(i)==l2.get(j))
			{
				System.out.println(i);
			}
				
	//l1.addAll(l2);
	//System.out.println(l1);
    // l2.removeAll(l1);
    //System.out.println(l2);
    //System.out.println(l1.size() - l2.size());
	}
	
	}
}

