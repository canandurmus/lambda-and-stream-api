package com.lets.learn.next.c03_changing_distinct_property;

import java.util.Arrays;
import java.util.List;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
    
    numbers.stream()
           .filter(e -> e % 2 == 0)
           .distinct()
           .forEach(System.out::println);
    //sized, ordered, distinct, non-sorted
  }
}