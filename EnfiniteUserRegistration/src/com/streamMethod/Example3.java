package com.streamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example3 {
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

		// To Array method
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Object[] newArray = numberList.stream().toArray();
		System.out.println(newArray.length);

		for (Object a : newArray) {
			System.out.println(a);
		}

		// reduce method

		List<String> StringList = Arrays.asList("A", "B", "C", "9", "10");
		Optional<String> finalString = StringList.stream().reduce((value, cominbeValue) -> {
			return cominbeValue + value;
		});

		System.out.println(finalString.get()); // 109CBA it return final string from last.
		//real time example -> in three location we have vote collected like location x,y,z and in this used map method on particular localtion and we are put toghter by using reduce method and count the vote it bigdata algorithem

	}

}
