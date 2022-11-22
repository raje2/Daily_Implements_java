package com.masai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class Demo2 {
	
	public static void main(String[] args) {
		
		Map<String, Student> hm = new HashMap<>();
		
		hm.put("Odisha", new Student(12, "Badal", 900));
		hm.put("Mumbai", new Student(13, "raja", 600));
		hm.put("Delhi", new Student(14, "koti", 790));
		hm.put("Bihar", new Student(15, "Babli", 500));
		hm.put("Karnatak", new Student(16, "varsha", 760));
		
		
		//get all the states
		
//		    Set<String> states =  hm.keySet();
//		    
//		    for(String a:states) {
//		    	System.out.println(a);
//		    }
		
		
		
		//get all the student list
//		Collection<Student> list =  hm.values();
//		
//		List<Student> students = new ArrayList<>(list);
//		
//		for(Student i: students) {
//			
//			System.out.println("Student Id is "+i.getId());
//			System.out.println("Student name is "+i.getName());
//			System.out.println("Student Marks is "+i.getMarks());
//			
//			System.out.println("*****************************");
//		}
//		
		
		//print value and keys simultaneously 
		
		Set<Map.Entry<String, Student>> set = hm.entrySet();
		
		for(Map.Entry<String, Student> k:set) {
			System.out.println("*****************************");
			System.out.println(k.getKey()+" states toppers detials are ");
			
			System.out.println("*****************************");
			Student stu = k.getValue();
			System.out.println("Student Id is "+stu.getId());
			System.out.println("Student name is "+stu.getName());
			System.out.println("Student Marks is "+stu.getMarks());
		}
		
	}

}
