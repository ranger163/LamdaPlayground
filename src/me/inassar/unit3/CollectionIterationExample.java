package me.inassar.unit3;

import me.inassar.unit1.exercise.SuperHero;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<SuperHero> superHeros = Arrays.asList(
                new SuperHero("Ahmed", "Nassar", 26),
                new SuperHero("Steve", "Rogers", 36),
                new SuperHero("Tony", "Stark", 42),
                new SuperHero("Thor", "Odin", 1500)
        );

        System.out.println("\nUsing for loop");
        for (int i = 0; i < superHeros.size(); i++) {
            System.out.println(superHeros.get(i));
        }

        System.out.println("\nUsing for in loop");
        for (SuperHero superHero : superHeros) {
            System.out.println(superHero);
        }

        System.out.println("\nUsing lambda for each loop");
        superHeros.forEach(System.out::println);
    }
}
