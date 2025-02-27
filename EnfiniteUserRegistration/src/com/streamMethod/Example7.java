package com.streamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example7 {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * import java.util.*; import java.util.stream.*;
	 * 
	 * public class EvenNumber{ public static void main(String args[]) {
	 * List<Integer> list = Arrays.asList(10,15,8,49,25,98,32); list.stream()
	 * .filter(n -> n%2 == 0) .forEach(System.out::println);
	 * 
	 * or can also try below method
	 * 
	 * Map<Boolean, List<Integer>> list = Arrays.stream(nums).boxed()
	 * .collect(Collectors.partitioningBy(num -> num % 2 == 0));
	 * System.out.println(list); } }
	 * 
	 * 
	 * Output: 10, 8, 98, 32
	 */
	
	
	
	public static void main(String[] args) {
		
		//cocatination
		List<String> list1 = Arrays.asList("Dog", "Cat", "Elephant");
		List<String> list2 = Arrays.asList("peackock", "parrot", "crow");
		
		Stream<String> stream1=	list1.stream();
		Stream<String> stream2=	list2.stream();
		
	List<String> finalva=Stream.concat(stream1,stream2).collect(Collectors.toList());
	System.out.println(finalva);
		
	}

}
