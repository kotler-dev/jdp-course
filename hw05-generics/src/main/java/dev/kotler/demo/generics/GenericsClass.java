package dev.kotler.demo.generics;

import java.util.HashMap;
import java.util.Map;

public class GenericsClass<K, V> {

    private final Map<K, V> kvHashMap = new HashMap<>();
    private K superKey;

    public static void main(String[] args) {
        GenericsClass<Integer, String> genericsClass = new GenericsClass<>();
        genericsClass.putVal(1, "data1");
        genericsClass.putVal(2, "data2");
        genericsClass.putVal(3, "data3");

        genericsClass.print();
    }

    private void putVal(K key, V value) {
        kvHashMap.put(key, value);
    }

    private void print() {
        kvHashMap.forEach((k, v) -> System.out.println("key: %s, val: %s".formatted(k, v)));
    }
}
