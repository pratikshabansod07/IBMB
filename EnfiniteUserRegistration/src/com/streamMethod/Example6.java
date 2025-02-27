package com.streamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example6 {

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

		List<String> list2 = Arrays.asList("kity", "puna", "mery", "cherry", "ashu");
		// FindAny

		Optional<String> newOne = list2.stream().findAny();
		System.out.println(newOne.get());

		List<String> list3 = Arrays.asList();
		// FindAny
		Optional<String> newOne1 = list3.stream().findAny();
		// System.out.println(newOne1.get());

		System.out.println("****************");

		// findFirst
		List<String> list = Arrays.asList("mimi", "puna", "mery", "cherry", "ashu");

		Optional<String> newOne2 = list.stream().findFirst();

		System.out.println(newOne2.get());

		List<String> lists = Arrays.asList();

		Optional<String> newOne3 = lists.stream().findFirst();

		System.out.println(newOne3.get()); // give exception

	}

}
