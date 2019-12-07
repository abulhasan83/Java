package org.array;

public class SingleC {
	static SingleC s = null;
private SingleC(int id)
{
	if(id==101) {
		System.out.println("Emp found");
	}
	else {
		System.out.println("Not found");
}
}

public static SingleC getIns() {
if(s==null) {
	s=new SingleC(101);
}
return s;
}

public void get() {
	System.out.println("Normal Method");
}

public static void main(String[] args) {
	getIns();
	System.out.println(getIns());
	SingleC r = getIns();
	System.out.println(r);
	r.get();
}
}
