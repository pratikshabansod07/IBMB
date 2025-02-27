package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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



public class MapMethod {
	
	public static void main (String arg[])
	{
		
		List<String> list = Arrays.asList("hello","amma","kuku","ridhu");
		
		List<String> newList = new ArrayList<String>();
		
		list.stream().map(e->e.toUpperCase()).forEach(System.out::println);
		System.out.println("____________________________");
		
		newList=list.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(newList);
		System.out.println("____________________________");
		
		list.stream().map(name->name.length()).forEach(System.out::println);
		
		
		
		
	}
	
	
}
