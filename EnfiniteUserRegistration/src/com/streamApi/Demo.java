package com.streamApi;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Demo {

	// Given a list of integers, find out all the even numbers that exist in the
	// list using Stream functions?
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
	
	
	public static void main(String arg[])
	{
		
		
		List<Integer> list = Arrays.asList(10,4,7,5,9);
		
		Stream s=list.stream().filter(n -> n%2 ==0);
		//System.out.println(s.toString());
		//s.forEach(System.out::println);
		
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		List<Integer> Oddarr = new ArrayList();
		arr.add(10);
		arr.add(29);
		arr.add(7);
		arr.add(40);
		
		//here added the all elemt into 
		Oddarr= arr.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
		System.out.println(Oddarr);
		
		//this is only return the value
	//	arr.stream().filter(n -> n%2 != 0).forEach(System.out::println);
		
		
		
	}

}
