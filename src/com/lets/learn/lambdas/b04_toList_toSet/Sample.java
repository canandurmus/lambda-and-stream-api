package com.lets.learn.lambdas.b04_toList_toSet;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);

    //double the even values and put that into a list.
    
    List<Integer> doubleOfEven =
      numbers.stream()
             .filter(e -> e % 2 == 0)
             .map(e -> e * 2)
             .collect(toList());
    
    System.out.println(doubleOfEven);
    
    //double the even values and put that into a set.
    
    Set<Integer> doubleOfEven2 =
      numbers.stream()
             .filter(e -> e % 2 == 0)
             .map(e -> e * 2)
             .collect(toSet());
    
    System.out.println(doubleOfEven2);
  }
}