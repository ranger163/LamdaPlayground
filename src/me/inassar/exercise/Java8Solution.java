package me.inassar.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java8Solution {

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
        printConditionally(superHeros, condition -> true);

        // Step 2: create a method that prints all people that have fist name starting with T
        System.out.println("\nPrinting all super heros starting with T");
        printConditionally(superHeros, superHero -> superHero.getFirstName().startsWith("T"));

        System.out.println("\nPrinting all super heros starts with A");
        printConditionally(superHeros, superHero -> superHero.getFirstName().startsWith("A"));

    }

    private static void printConditionally(List<SuperHero> superHeros, Condition condition) {
        for (SuperHero superHero : superHeros) {
            if (condition.test(superHero)) {
                System.out.println(superHero);
            }
        }
    }
}
