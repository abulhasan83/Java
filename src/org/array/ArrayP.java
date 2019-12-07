package org.array;

public class ArrayP {
public static void main(String[] args) {
	int a[] = new int[11];
	int sum = 0;
	for(int i=0;i<11;i++)
	{
		a[i]=i;
	}
	for(int i=0;i<11;i++)
	{
		sum = sum+a[i];
	}
		System.out.println(sum);
}
}
