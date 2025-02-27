package com.streamMethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
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
	public static void main(String[] args) {
		
		//sorted method
		List<Integer> numberList = Arrays.asList( 2, 3, 1, 5, 4, 7, 9, 8);
		List<Integer> sortedNum=numberList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNum);
	//	numberList.stream().sorted().collect(Collectors.toList()).forEach(System.out::print);
		
		System.out.println("*************");
		List<Integer> sortedRevNum=numberList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedRevNum);
		
		System.out.println("*************");
		
		List<String> list2 = Arrays.asList( "kity","puna","mery","cherry","ashu");
		
		List<String> list2New =list2.stream().sorted().collect(Collectors.toList());
		System.out.println(list2New);//[ashu, cherry, kity, mery, puna]
		
		List<String> list2News =list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list2News);//[puna, mery, kity, cherry, ashu]


	}

}
