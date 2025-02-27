package com.streamApi;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class FlatMap {


	public static void main(String[] args) {
		
		//Map
		List <Integer> mapList = Arrays.asList(1,2,3,4,5,6);
		List <Integer> newMap= mapList.stream().map(e -> e*10).collect(Collectors.toList());
		System.out.println(newMap);
		System.out.println("________________________________");
		
		//Flat Map
		List <Integer> list1 = Arrays.asList(1,2);
		List <Integer> list2 = Arrays.asList(3,4);
		List <Integer> list3 = Arrays.asList(5,6);
		
		List<List<Integer>> totalList = Arrays.asList(list1,list2,list3);
		System.out.println(totalList);
		System.out.println("________________________________");
		
		//System.out.println("added into flatmap "+totalList.stream().flatMap(x -> x.stream()));
		List <Integer> listfinal=	totalList.stream().flatMap(x -> x.stream().map(n ->n*10)).collect(Collectors.toList());
		
		System.out.println(listfinal);
		
		System.out.println("***********************************************");
		
		
		
		List <String> team1 = Arrays.asList("scott","David","jhon");
		List <String> team2 = Arrays.asList("Marry","Luna","Tom");
		List <String> team3 = Arrays.asList("Ken","Jony","Kityy");
		
		List<List <String>> Player = new ArrayList<List <String>>();
		Player.add(team1);
		Player.add(team2);
		Player.add(team3);
		
		List <String>namePlayer=Player.stream().flatMap(p-> p.stream()).collect(Collectors.toList());
		System.out.println(namePlayer);
		
		
		
		

	}

}
