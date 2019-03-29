package com.lets.learn.lambdas.b08_using_infinite_streams;

import java.util.stream.Stream;

public class Sample {
  
  public static void main(String[] args) {
	// Starting from k, find the sum of double of n even numbers 
	// where sqrt of each number is > 20
  
    int k = 121;
    int n = 51;
    System.out.println(computeImperative(k, n));
    System.out.println(computeFunctional(k, n));
  }
  
  public static int computeImperative(int k, int n) {
	     int result = 0;
	     
	     int index = k;
	     int count = 0;
	     while(count < n) {
	       if(index % 2 == 0 && Math.sqrt(index) > 20) {
	         result += index * 2;
	         count++;
	       }      
	       index++;
	     }
	    return result;
	  }
	  
	  public static int computeFunctional(int k, int n) {
		  return Stream.iterate(k, e -> e + 1)         
		          .filter(e -> e % 2 == 0)        
		          .filter(e -> Math.sqrt(e) > 20) 
		          .mapToInt(e -> e * 2)           
		          .limit(n)                      
		          .sum();
	  }
}