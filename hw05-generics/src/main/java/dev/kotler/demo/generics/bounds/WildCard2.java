package dev.kotler.demo.generics.bounds;

import dev.kotler.demo.generics.bounds.entries.Cat;
import dev.kotler.demo.generics.bounds.entries.HomeCat;
import dev.kotler.demo.generics.bounds.entries.WildCat;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class WildCard2 {
    public static void main(String[] args) {
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        catList.add(new HomeCat("Barsik"));
        catList.add(new WildCat("Bagira"));
//        print(catList); // error -> expected List<Animal>
        printObj(catList);

        List<String> stringList = new ArrayList<>();
        stringList.add("fake1");
        stringList.add("fake2");
        stringList.forEach(i -> {
            if (i instanceof String) {
                System.out.println(i);
            }
        });

        printWild(stringList);
        printObj(stringList);

        List voidList = new ArrayList<>();
        voidList.add(LocalTime.now());
        printWild(voidList);
        printObj(voidList);
    }


    // Unbounded Wildcards
    private static void printWild(List<?> animalList) {
        // animalList.add("внезапно добавленная строка"); //ошибка
        animalList.forEach(System.out::println);
    }

    private static void printObj(List animalList) {
//        animalList.add("внезапно добавленная строка");
        animalList.forEach(System.out::println);
    }
}
