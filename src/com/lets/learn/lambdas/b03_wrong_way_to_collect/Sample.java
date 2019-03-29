package com.lets.learn.lambdas.b03_wrong_way_to_collect;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);

    //double the even values and put that into a list.
    
    //wrong way to do this.
    List<Integer> doubleOfEven = new ArrayList<>();

    numbers.stream()
           .filter(e -> e % 2 == 0)
           .map(e -> e * 2)
           .forEach(e -> doubleOfEven.add(e));
    
    System.out.println(doubleOfEven); 

    
    //correct way
    List<Integer> doubleOfEven2 =
      numbers.stream()
             .filter(e -> e % 2 == 0)
             .map(e -> e * 2)
             .collect(toList());
    
    System.out.println(doubleOfEven2);
  }
}