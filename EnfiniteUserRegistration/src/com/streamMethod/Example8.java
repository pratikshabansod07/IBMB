package com.streamMethod;

import java.util.Stack;

public class Example8 {

	public static void main(String[] args) {

		   String s = " ";

	        Stack<Character> stack = new Stack<>();

	        boolean isValid = true;

	        for (char c : s.toCharArray()) {

	            if (c == '(' || c == '{' || c == '[') {
	                stack.push(c);
	            } else {
	                // Check if stack is empty before popping
	                if (stack.isEmpty()) {
	                    isValid = false;
	                    break;
	                }

	                char top = stack.pop();

	                // Correct condition to check matching pairs
	                if ((c == ')' && top != '(') || 
	                    (c == '}' && top != '{') || 
	                    (c == ']' && top != '[')) {
	                    isValid = false;
	                    break;
	                }
	            }
	        }

	        // If stack is not empty, the parentheses are not balanced
	        if (stack.isEmpty()) {
	            isValid = false;
	        }
	        
	        
	        System.out.println(s + " = " + isValid);
	    }
	}