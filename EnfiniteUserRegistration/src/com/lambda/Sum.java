package com.lambda;

@FunctionalInterface
public interface Sum {
	
	void getValue(int a, int b);
	//public int getSum(int a, int b);
	 default void getValue1()
	 {
	 
	 }
	
	 static void getValue2()
	 {
	 
	 }

}
