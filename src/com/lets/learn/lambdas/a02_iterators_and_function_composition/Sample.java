package com.lets.learn.lambdas.a02_iterators_and_function_composition;

import java.util.Arrays;
import java.util.List;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    //external iterators
    // for(int i = 0; i < numbers.size(); i++) {
    //   System.out.println(numbers.get(i));
    // }
    
    //external iterators also
    // for(int e : numbers) {
    //   System.out.println(e);
    // }
    
    //internal iterators
    // numbers.forEach(new Consumer<Integer>() {
    //   public void accept(Integer value) {
    //     System.out.println(value);
    //   }
    // });


    // numbers.forEach((Integer value) -> System.out.println(value));

    //numbers.forEach((value) -> System.out.println(value));
    //Java 8 has type inference, finally, hold your tweets, but only for
    //lambda expressions.
 
    //numbers.forEach(value -> System.out.println(value));
    //parenthesis is optional, but only for one parameter lambdas.
    
    numbers.forEach(System.out::println);
    
 //given the values, double the even numbers and total.
    
	//    int result = 0;
	//    
	//    for(int e : numbers) {
	//      if(e % 2 == 0) {
	//        result += e * 2;
	//      }
	//    }
	//    
	//    System.out.println(result);
	//    
	//    System.out.println(
	//      numbers.stream()
	//             .filter(e -> e % 2 == 0)
	//             .mapToInt(e -> e * 2)
	//             .sum());
  }
}