package dev.kotler.demo.generics;

public class GenericsMethod {
    public static void main(String[] args) {
        GenericsMethod genericsMethod = new GenericsMethod();
        genericsMethod.print(1, "one");
        genericsMethod.print(2, "two");
    }

    private static <N, S> void print(N num, S str) {
        System.out.println("num: %s, str: %s".formatted(num, str));
    }
}
