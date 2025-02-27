package com.streamMethod;

import java.util.HashSet;
import java.util.Set;

public class Example5 {

	public static void main(String[] args) {
		
		
		//anyMatch
		Set<String>  fruit= new HashSet<String>();
		
		fruit.add("One apple");
		fruit.add("One mango");
		fruit.add("Two apple");
		fruit.add("More greapes");
		fruit.add("Two guvaes");
		
	boolean valye=	fruit.stream().anyMatch(e-> 
			{return e.startsWith("One");
			}
		);
		
		System.out.println(valye);

		System.out.println("*********************");
		
		
		valye=fruit.stream().allMatch(e->{
			return e.startsWith("One");
		});
	
		System.out.println(valye);  //checking all values start with One so return false
		
		
		System.out.println("*********************");
		
		
		valye=fruit.stream().noneMatch(e->{
			return e.startsWith("ap");
		});
	
		System.out.println(valye);  //checking all values start with One so return false
		
		
		
		
		
		
		
	}

}
