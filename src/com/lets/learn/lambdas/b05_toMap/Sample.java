package com.lets.learn.lambdas.b05_toMap;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.List;

import com.lets.learn.lambdas.util.Gender;
import com.lets.learn.lambdas.util.Person;

public class Sample {
  public static List<Person> createPeople() {
    return Arrays.asList(
	    new Person("Sara", Gender.FEMALE, 20),
	    new Person("Sara", Gender.FEMALE, 22),
	    new Person("Bob", Gender.MALE, 20),
	    new Person("Paula", Gender.FEMALE, 32),
	    new Person("Paul", Gender.MALE, 32),
	    new Person("Jack", Gender.MALE, 2),
	    new Person("Jack", Gender.MALE, 72),
	    new Person("Jill", Gender.FEMALE, 12)
	  );
  }

  public static void main(String[] args) {
    List<Person> people = createPeople();
   
  //given a list of people, create a map where
    //their name is the key and value is all the people with that name.
    
//   System.out.println(
//      people.stream()
//            .collect(groupingBy(Person::getName)));
//    
    //given a list of people, create a map where
    //their name is the key and value is all the ages of people with that name
    
    System.out.println(
      people.stream()
            .collect(groupingBy(Person::getName, mapping(Person::getAge, toList()))));
    
    
    
    
    //create a Map with name and age as key, and the person as value.
    //anybody want to write this code imperative way? is it fun?
    
//    
//    System.out.println(
//      people.stream()
//            .collect(toMap(
//              person -> person.getName() + "-" + person.getAge(),
//              person -> person)));
  }
}