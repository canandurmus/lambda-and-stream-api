package com.lets.learn.lambdas.a02_iterators_and_function_composition;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HandsOn {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Printing numbers form 1 to 10

		// external iterators
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}


		// external iterators 2
		for(Integer element : numbers) {
			System.out.println(element);
		}


		// internal iterators 1
		numbers.forEach((Integer item) -> 
					System.out.println(item));
		

		numbers.forEach(System.out::println);
		
		
		// internal iterators simplified
		

		// internal iterators function reference	

		
		// given the values, double the even numbers and total.
		// traditional way

		
		// with lambda expression (function composition)


	}
}