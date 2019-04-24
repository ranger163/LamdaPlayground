package me.inassar.unit2;

import me.inassar.unit1.exercise.SuperHero;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {

    public static void main(String[] args) {
        List<SuperHero> superHeros = Arrays.asList(
                new SuperHero("Ahmed", "Nassar", 26),
                new SuperHero("Steve", "Rogers", 36),
                new SuperHero("Tony", "Stark", 42),
                new SuperHero("Thor", "Odin", 1500)
        );

        // Step 1: sort list by last name
        Collections.sort(superHeros, (superHero1, superHero2)
                -> superHero1.getLastName().compareTo(superHero2.getLastName()));

        // Step 2: create a method that prints all elements of the list
        System.out.println("\nPrinting all super heros");
        performConditionally(superHeros, condition -> true, superHero -> System.out.println(superHero));

        // Step 2: create a method that prints all people that have fist name starting with T
        System.out.println("\nPrinting all super heros starting with T");
        performConditionally(superHeros, superHero -> superHero.getFirstName().startsWith("T"),
                superHero -> System.out.println(superHero));

        System.out.println("\nPrinting all super heros starts with A");
        performConditionally(superHeros, superHero -> superHero.getFirstName().startsWith("A"),
                superHero -> System.out.println(superHero));

    }

    private static void performConditionally(
            List<SuperHero> superHeros, Predicate<SuperHero> predicate,
            Consumer<SuperHero> consumer) {
        for (SuperHero superHero : superHeros) {
            if (predicate.test(superHero)) {
                consumer.accept(superHero);
            }
        }
    }
}
