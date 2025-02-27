package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	
	String sname;
	int sid;
	char greade;
	
	Student(String sname,int sid,char greade)
	{
		this.sname=sname;
		this.sid=sid;
		this.greade=greade;
	}
}


public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList1 = new ArrayList<Student>();
		studentList1.add(new Student("Smith", 101, 'A'));
		studentList1.add(new Student("Jhon", 102, 'B'));
		studentList1.add(new Student("Kendy", 103, 'C'));
		
		List<Student> studentList2 = new ArrayList<Student>();
		studentList2.add(new Student("Scotty", 104, 'A'));
		studentList2.add(new Student("Marry", 105, 'B'));
		studentList2.add(new Student("Kitty", 106, 'C'));
		
		
		List<List<Student>>  studentList = Arrays.asList(studentList1,studentList2);
		
  List<String>	finalStudnt=studentList.stream().flatMap(s->s.stream()).map(e->e.sname).collect(Collectors.toList());
		
  System.out.println(finalStudnt); //[Smith, Jhon, Kendy, Scotty, Marry, Kitty]
		
	}

}
