package com.java.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int age;
	String name;
	
	public Student(int age,String name) {
		this.age=age;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
}

public class StudentComparator {

	public static void main(String[] args) {
		
//		Comparator<Student> com=new Comparator<Student>() {
//			public int compare(Student i,Student j) {
////				if(i.age>j.age)
////					return 1;
////				else
////					return -1;
//				return i.age>j.age?1:-1;
//			}
//			
//		};
		Comparator<Student> com=(i,j)->i.age>j.age?1:-1;
		
		List<Student> st=new ArrayList<Student>();
		st.add(new Student(12, "Ajeet"));
		st.add(new Student(32, "sri"));
		st.add(new Student(18, "chandra"));
		st.add(new Student(15, "surya"));
		
		Collections.sort(st,com);
		for(Student s:st) {
			System.out.println(s);
		}
		
		
	}

}
