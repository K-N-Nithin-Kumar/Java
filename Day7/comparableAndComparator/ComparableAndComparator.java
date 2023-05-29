package com.java.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparator {

	public static void main(String[] args) {
		
		Comparator<Integer> com=new Comparator<Integer>() {
			public int compare(Integer i,Integer j) {
				if(i%10>j%10) 
					return 1;
				else
					return -1;
				}
		
		};
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(99);
		list.add(18);
		list.add(94);
		
		Collections.sort(list,com);
		System.out.println(list);
	}

}
