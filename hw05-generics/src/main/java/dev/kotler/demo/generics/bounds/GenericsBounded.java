package dev.kotler.demo.generics.bounds;

import dev.kotler.demo.generics.bounds.entries.Cat;
import dev.kotler.demo.generics.bounds.entries.HomeCat;
import dev.kotler.demo.generics.bounds.entries.SeberianCat;
import dev.kotler.demo.generics.bounds.entries.WildCat;

public class GenericsBounded<T extends Cat> {
    public static void main(String[] args) {
//        GenericsBounded<Animal> animalGenericsBounded = new GenericsBounded<Animal>();
        GenericsBounded<HomeCat> homeCatGenericsBounded = new GenericsBounded<>();
        GenericsBounded<SeberianCat> seberianCatGenericsBounded = new GenericsBounded<>();
        GenericsBounded<WildCat> wildCatGenericsBounded = new GenericsBounded<>();
    }
}
