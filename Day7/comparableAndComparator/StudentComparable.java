package com.java.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {
	int age;
	String name;

	public Students(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Students that) {
		if (this.age > that.age)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Students [age=" + age + ", name=" + name + "]";
	}

}

public class StudentComparable {

	public static void main(String[] args) {

		List<Students> st = new ArrayList<Students>();
		st.add(new Students(12, "Ajeet"));
		st.add(new Students(32, "sri"));
		st.add(new Students(18, "chandra"));
		st.add(new Students(15, "surya"));

		Collections.sort(st);
		for (Students s : st) {
			System.out.println(s);
		}

	}

}
