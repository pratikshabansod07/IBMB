package com.streamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example2 {
	
	
public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		//count
		Long evenNum=numberList.stream().filter(n->n%2 == 0).count();
		System.out.println("count of even number = " +evenNum);
		
	//min
		
		Optional minValue=	numberList.stream().min((val1,val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println("min value = "+minValue);
		
	//max	
		Optional maxValue=	numberList.stream().max((val1,val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println("min value = "+maxValue);
		
		
		
		
}

}
