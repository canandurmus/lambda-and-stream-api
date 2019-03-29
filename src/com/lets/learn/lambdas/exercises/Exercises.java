package com.lets.learn.lambdas.exercises;

import java.util.Arrays;
import java.util.List;

public class Exercises {

	public static void main(String args[]) {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

		// Count the empty strings
        long count = 0;
        
        System.out.println("count of empty strings : " + count);
        
        // Count String with length more than 3
		
        System.out.println("count of strings longer than 3 chars : " + count);

        // Count number of String which startswith "a"
        
        System.out.println("count of strings starts with a : " + count);
	
        // Remove all empty Strings from List
        List<String> resultList = null;
        System.out.printf("Empty strings removed %s \n" , resultList);
        
        // Create a List with String more than 2 characters        
        System.out.printf("Strings has more than 2 chars %s \n" , resultList);
        
        
        // Convert String to Uppercase and join them using comma
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy",
                                           "U.K.","Canada");
        String concated = null;
        						
        
        System.out.println("Concated : " + concated);
        
        // Create List of square of all distinct numbers
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> square = null;
        System.out.println("Squares : " + square);
        
      //Get count, min, max, sum, and average for numbers
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
              		
        
	}
}
