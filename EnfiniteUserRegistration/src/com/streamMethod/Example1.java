package com.streamMethod;

import java.util.*;
import java.util.stream.Collectors;

public class Example1 {
	
	
	//distinct()- find the unique object
	//limit()
	//count()
	public static void main(String[] args) {
		
		List<String> vehicalList = Arrays.asList("bus","car","bycle","bus","car","car","bike");
		
		//distinct()- find the unique object
		List<String> uniqueVehicals=vehicalList.stream().distinct().collect(Collectors.toList());
		
		System.out.println("distinct() method =  "+uniqueVehicals); //[bus, car, bycle, bike]
		
		vehicalList.stream().distinct().forEach(value ->System.out.println(value));
		
		System.out.println("******************************");
		
		//count()
		long count= vehicalList.stream().distinct().count();
		System.out.println(count);
		
		System.out.println("******************************");
		
		//limit()
		List<String> limit=vehicalList.stream().limit(4).collect(Collectors.toList());
		
		System.out.println(limit);
		

	}

}
