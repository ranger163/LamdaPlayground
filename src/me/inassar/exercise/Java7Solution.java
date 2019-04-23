package me.inassar.exercise;

import java.util.*;

public class Java7Solution {

    public static void main(String[] args) {
        List<SuperHero> superHeros = Arrays.asList(
                new SuperHero("Ahmed", "Nassar", 26),
                new SuperHero("Steve", "Rogers", 36),
                new SuperHero("Tony", "Stark", 42),
                new SuperHero("Thor", "Odin", 1500)
        );

        // Step 1: sort list by last name
        Collections.sort(superHeros, new Comparator<SuperHero>() {
            @Override
            public int compare(SuperHero superHero1, SuperHero superHero2) {
                return superHero1.getLastName().compareTo(superHero2.getLastName());
            }
        });

        // Step 2: create a method that prints all elements of the list
        System.out.println("\nPrinting all super heros");
        printAll(superHeros);

        // Step 2: create a method that prints all people that have fist name starting with T
        System.out.println("\nPrinting all super heros starting with T");
        printConditionally(superHeros, new Condition() {
            @Override
            public boolean test(SuperHero superHero) {
                return superHero.getFirstName().startsWith("T");
            }
        });

        System.out.println("\nPrinting all super heros starts with A");
        printConditionally(superHeros, new Condition() {
            @Override
            public boolean test(SuperHero superHero) {
                return superHero.getFirstName().startsWith("A");
            }
        });

    }

    private static void printAll(List<SuperHero> superHeros) {
        for (SuperHero superHero : superHeros) {
            System.out.println(superHero);
        }
    }

    private static void printConditionally(List<SuperHero> superHeros, Condition condition) {
        for (SuperHero superHero : superHeros) {
            if (condition.test(superHero)) {
                System.out.println(superHero);
            }
        }
    }
}

interface Condition {
    boolean test(SuperHero superHero);
}