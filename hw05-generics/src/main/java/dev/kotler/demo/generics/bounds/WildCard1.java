package dev.kotler.demo.generics.bounds;

import dev.kotler.demo.generics.bounds.entries.Animal;
import dev.kotler.demo.generics.bounds.entries.Cat;
import dev.kotler.demo.generics.bounds.entries.HomeCat;
import dev.kotler.demo.generics.bounds.entries.WildCat;

import java.util.ArrayList;
import java.util.List;

public class WildCard1 {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal());
        print(animalList);
        printWild(animalList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        catList.add(new HomeCat("Barsik"));
        catList.add(new WildCat("Bagira"));
//        print(catList); // error -> expected List<Animal>
        printWild(catList);
    }

    private static void print(List<Animal> animalList) {
        animalList.forEach(System.out::println);
    }

    private static void printWild(List<? extends Animal> animals) {
        animals.forEach(System.out::println);
    }
}
