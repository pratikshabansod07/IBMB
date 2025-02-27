package com.streamMethod;

import java.util.*;
import java.util.stream.Collectors;
public class Example9 {
	
	  String name;
	  String department;
	  
	  @Override
		public String toString() {
			return "Example9 [name=" + name + ", department=" + department + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDepartment() {
			return department;
		}

		public Example9(String name, String department) {
			super();
			this.name = name;
			this.department = department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

	public static void main(String[] args) {
		
		
//		
//		int no  = 2;
//		int temp=0;
//		for(int i=no;i>0; i--)
//		{
//			if(no%i==0)
//			{
//				temp++;
//			}
//		}
//		
//		if(temp>2)
//		System.out.println("not prime");
//		else
//			System.out.println("prime");
//	}
	
//	int arr[]= {1,2,5,8,6,9};
//	int max = arr [0];
//	
//	for(int i=0;i<arr.length;i++)
//	{
//		if(arr[i]>max)
//		{
//			max=arr[i];
//		}
//	}
//	
//	System.out.println(max);
//	
//	}
		
		List<Example9> example9= Arrays.asList(

				new Example9("hi" ,"IT"),
				new Example9("PUU" ,"NO"),
				new Example9("hUU" ,"IT")
				);
		
		List s=	example9.stream().filter(e-> "IT".equals(e.getDepartment()))
				 .map(Example9::getName).
				collect(Collectors.toList());
	
	System.out.println(s);
		
	}

	
}
