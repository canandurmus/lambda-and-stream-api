package com.lets.learn.lambdas.exercises;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class Exercises {

	public static void main(String args[]) {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

		// Count the empty strings
        long count = strList.stream()
        		.filter(e -> e.isEmpty())
        		.count();
        System.out.println("count of empty strings : " + count);
        
        // Count String with length more than 3
		count = strList.stream()
				.filter(e -> e.length() > 3)
				.count();
        System.out.println("count of strings longer than 3 chars : " + count);

        // Count number of String which startswith "a"
        count = strList.stream()
        		.filter(e -> e.startsWith("a"))
        		.count();
        System.out.println("count of strings starts with a : " + count);
	
        // Remove all empty Strings from List
        List<String> resultList = strList.stream()
        							.filter(e-> !e.isEmpty())
        							.collect(toList());
        System.out.printf("Empty strings removed %s \n" , resultList);
        
        // Create a List with String more than 2 characters
        resultList = strList.stream()
        				.filter(e -> e.length() > 2)
        				.collect(toList());
        
        System.out.printf("Strings has more than 2 chars %s \n" , resultList);
        
        
        // Convert String to Uppercase and join them using comma
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy",
                                           "U.K.","Canada");
        String concated = G7.stream()
        						.map(e -> e.toUpperCase())
        						.collect(joining(", "));
        						
        
        System.out.println("Concated : " + concated);
        
        // Create List of square of all distinct numbers
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> square =  numbers.stream()
						        		.distinct()
						        		.map(e -> e * e)
						        		.collect(toList());
        System.out.println("Squares : " + square);
        
      //Get count, min, max, sum, and average for numbers
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println(primes.stream().count());
        System.out.println(primes.stream().min((e1, e2) -> e1.compareTo(e2)));
        System.out.println(primes.stream().max((e1, e2) -> e1.compareTo(e2)));
        System.out.println(primes.stream().mapToInt(e -> e).sum());
        System.out.println(primes.stream().mapToDouble(e -> e).average());
        		
        		
        
	}
}
