package me.inassar.unit3;

import me.inassar.unit1.exercise.SuperHero;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamsExample1 {

    public static void main(String[] args) {
        List<SuperHero> superHeros = Arrays.asList(
                new SuperHero("Ahmed", "Nassar", 26),
                new SuperHero("Steve", "Rogers", 36),
                new SuperHero("Tony", "Stark", 42),
                new SuperHero("Thor", "Odin", 1500)
        );

        superHeros.stream()
                .filter(superHero -> superHero.getFirstName().startsWith("T"))
                .forEach(superHero -> System.out.println(superHero.getFirstName())
                );
    }
}
