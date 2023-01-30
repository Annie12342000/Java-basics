package com.annie.array;
import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		Student [] s = {
				new Student("asu",223,387047047.32),
				new Student ("annie",16,94042.090),
				new Student ("burla",16,94042.090),
				new Student ("jspider",16,94042.090),
				
		
		};
		//Arrays.sort(s);
		Arrays.sort(s,new ageComp());
		for(Student stu:s)
		{
			System.out.println(stu);
		}
 
	}

}

class Student implements Comparable {
	String name;
	int age;
	double sal;

	public Student(String n, int a, double s) {
		this.name = n;
		this.age = a;
		this.sal = s;
	}

	public String toString() {
		return "[" + "name:"+name + "," + "age:" + "=" + age + "sal:" + "=" +sal + "]";

	}

	public int compareTo(Object arg) {
		Student s = (Student) arg;
		if(age>s.age)
		return 1;
		if(age<s.age)
		return -1;
		return 0;

	}

}
//class nameCompare implements Comparator{
//
//
//	@Override
//	public int compare(Object arg1, Object arg2) {
//		Student n1=(Student)arg1;
//		Student n2 = (Student)arg2;
//		return n1.name.compareTo(n2.name);
//		
//	}
//	
//}

class ageComp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		Student s1 = o1;
		Student s2 = o2;
		if(s1.age>s2.age)
			return 1;
		if(s1.age<s2.age)
			return -1;
		
		return 0;
	}
	
}