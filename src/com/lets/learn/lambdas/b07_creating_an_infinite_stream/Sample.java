package com.lets.learn.lambdas.b07_creating_an_infinite_stream;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.stream.Stream;

public class Sample {
  public static void main(String[] args) {
    System.out.println(Stream.iterate(100, e -> e + 1));
    
    List<Integer> collect = Stream.iterate(100, e -> e + 1)
    	      .limit(5)
    	      .collect(toList());
    
    collect.add(1);
    
    //start with 100, create a series
    //100, 101, 102, 103, ...
    
    System.out.println(Stream.generate(Math::random));
    
    Stream.generate(Math::random)
    	  .limit(5)
    	  .forEach(System.out::println);
    
  }
}