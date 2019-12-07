package org.array;

import java.lang.reflect.Array;

public class ArrayAv {
public static void main(String[] args) {
	int sum = 0;
	int a[]= {1,2,3,5,6,7,8,9,10};
	for(int i=0;i<Array.getLength(a);i++) {
		sum=sum+a[i];
	}
	float avg = sum/10;
	System.out.println(avg);
}
}
