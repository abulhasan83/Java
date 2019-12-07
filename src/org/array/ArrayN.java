package org.array;

public class ArrayN {
public static void main(String[] args) {
	int a[]= {4,8,24,68,10,77};
	System.out.println(a[3]);
	a[3]=a[0];
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	ArrayN n = new ArrayN();
}
}
