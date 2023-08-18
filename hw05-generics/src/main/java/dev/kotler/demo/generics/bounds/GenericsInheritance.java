package dev.kotler.demo.generics.bounds;

import dev.kotler.demo.generics.bounds.entries.Animal;
import dev.kotler.demo.generics.bounds.entries.Cat;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {
    public static void main(String[] args) {
        Animal cat = new Cat();
        List<Cat> catList = new ArrayList<>();
//        List<Animal> animalList = catList; // error
    }
}
