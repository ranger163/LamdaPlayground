package me.inassar.unit3;

import me.inassar.unit1.exercise.SuperHero;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<SuperHero> superHeros = Arrays.asList(
                new SuperHero("Ahmed", "Nassar", 26),
                new SuperHero("Steve", "Rogers", 36),
                new SuperHero("Tony", "Stark", 42),
                new SuperHero("Thor", "Odin", 1500)
        );

        System.out.println("\nPrinting all super heros");
        performConditionally(superHeros, condition -> true, System.out::println);  // p -> method(p)
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
