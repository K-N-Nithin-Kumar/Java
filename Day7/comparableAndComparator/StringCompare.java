package com.java.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringCompare {

	public static void main(String[] args) {
		
		Comparator<String> com=new Comparator<String>() {
			public int compare(String i,String j) {
				if(i.length()>j.length())
					return 1;
				else 
					return -1;
			}
		};
		
		List<String> list=new ArrayList<>();
		list.add("Ajeet kumar");
		list.add("Kumar");
		list.add("Sri surya");
		list.add("chndrakant");
		
		Collections.sort(list,com);
		System.out.println(list);
	}

}
