package com.lets.learn.lambdas.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.*;

public class Exercises2 {

	public static void main(String args[]) {
		List<Person> people = Arrays.asList(				
				new Person("Cahit Sýtký", "Tarancý", 32),
				new Person("Cemal", "Süreya", 35),
				new Person("Abidin", "Dino", 42),
				new Person("Orhan", "Veli", 37),
				new Person("Tomris", "Uyar", 45),
				new Person("Nazým", "Hikmet", 47),
				new Person("Turgut", "Uyar", 55)
		);

		//Sort list by surname
		people.stream().sorted(
				(Person person1, Person person2) -> 
				 person1.getSurname().compareTo(person2.getSurname()))
				 .forEach(System.out::println);
		
		// Create a method that prints all elements in the list
		
		// Create a method that prints all elemens having a surname that begins with U
		people.stream()
			.filter(e -> e.getSurname().startsWith("U"))
			.forEach(System.out::println);
        
	}
}
