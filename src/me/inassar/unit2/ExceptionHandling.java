package me.inassar.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandling {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int key = 0;

        process(numbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : numbers) {
            biConsumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
        return (v, k) -> {
            try {
                biConsumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in wrapper lambda");
            }
        };
    }
}
