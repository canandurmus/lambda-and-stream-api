package com.lets.learn.lambdas.a03_method_references;

import java.util.Arrays;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
	
		List<String> stringNumbers = Arrays.asList("11", "142", "12", "34", "5", "28", "72", "18", "9", "1");
		
		// print the numbers (parameter as an argument)
		stringNumbers.forEach(System.out::println);
		//.forEach(e -> System.out.println(e));
		//.forEach(System.out::println);

		// convert numbers to int and print to out 
		// (parameter as an argument to a static method)
		stringNumbers.stream()
			//.map(e -> Integer.parseInt(e))
			.map(Integer::parseInt)
			.forEach(System.out::println);

		// print the length of each element to output 
		// (parameter as a target)
		stringNumbers.stream()
			//.map(e -> e.length())
			.map(String::length)
			.forEach(System.out::println);
		
		// convert the numbers to int and sum them up, print the result 
		// (two parameters as argument)
		System.out.println(
				stringNumbers.stream()
				.map(Integer::parseInt)
				//.reduce(0, (total, e) -> Integer.sum(total, e)));
				.reduce(0, Integer::sum)); // parametrelerin sýralamasý her iki tarafata da ayný olmalý.

		// concat the numbers and print the result  
		// (two parameters, one as target the other as an arguement)
		System.out.println(
				stringNumbers.stream()
					//.reduce("", (result, s) -> result.concat(s)) // 2 parametreden birisi 
					.reduce("", String::concat) // ayný zamanda target haline geliyor.
				);
	}
}