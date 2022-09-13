package com.te.functioninterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Employee>asList=Arrays.asList(new Employee(1,"Amit",25000),new Employee(2,"Darshan",20000),
				new Employee(3,"Rohit",150000),new Employee(1, "dhiraj", 45000) );
		Stream<Employee> stream=asList.stream();
		boolean anyMatch=stream.allMatch((e1)->e1.getName().equals("Zayan"));
		System.out.println(anyMatch);
		
//		asList.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
//		.collect(Collectors.toList()).forEach(System.out::println);
//	}
//
//		
//		
//		Comparator<Employee>com=(Employee e1,Employee e2) ->{
//			return e1.getSalary().compareTo(e2.getSalary());
//			
//		};
	    
//		Collections.sort(asList,com);
//		System.out.println(asList.size()-1);
//		Optional<Employee>max
//		=asList.stream().max(com);
//		
//		Function<Employee,Double> f=(e)->{
//			return e.getSalary();
//		};
//		asList.stream().max(Comparator.comparing(f)).ifPresent(System.out::println);
//		system.out.pritnln(max2.get());
//		system.out.println(asList);
//		system.out.println(asList.size()-1.getName());
	
		
//		Predicate<Employee>p=(e)->{
//			if(e.getSalary()>5000) {
//				return true;
//			}
//			else {
//				return false;
//			};
//			List<Employee>collect=asList.stream().filter(p).collect(Collectors.toList());
//		for(Iterator iterator=collect.iterator();iterator.hasNext();) {
//			Employee employee=(Employee)iterator.next();
//			System.out.println(employee);
//			
//			
//			
			
}
}
