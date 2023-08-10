package dev.kotler.catpack;

import org.jboss.logging.Logger;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class MainCatMap {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MainCatMap.class);

//        var cats1 = new ArrayList<Cat>();
//        cats1.add(new Cat("Vasya", "gray", 1));
//        cats1.add(new Cat("Nimp", "red", 2));
//        cats1.add(new Cat("Motya", "yellow", 4));
//
//        System.out.println(cats1);
//
//        for (var cat : cats1) {
//            System.out.println(cat);
//        }

//        Cat[] cats2 = new Cat[3];
//        cats2[0] = new Cat("Vasya", "gray", 1);
//        cats2[1] = new Cat("Nimp", "red", 2);
//        cats2[2] = new Cat("Motya", "yellow", 4);
//
//        System.out.println(cats2.toString());
//
//        for (var cat : cats2) {
//            System.out.println(cat.toString());
//        }

//        var cats3 = new HashMap<Cat, Integer>();
//        cats3.put(new Cat("Vasya", "gray", 1), 42);
//        cats3.put(new Cat("Nimp", "red", 2), 13);
//        cats3.put(new Cat("Motya", "yellow", 4), 8);
//
//        for (var cat : cats3.entrySet()) {
//            System.out.println(cat.getKey().getName() + " - " + cat.getKey() + " - " + cat.getValue());
//        }
//
//        var cats4 = new HashSet<Cat>();
//        cats4.add(new Cat("Vasya", "gray", 1));
//        cats4.add(new Cat("Nimp", "red", 2));
//        cats4.add(new Cat("Motya", "yellow", 4));
//
//        for (var cat : cats4) {
//            System.out.println(cat);
//        }

//        var cats5 = new LinkedList<Cat>();
//        cats5.add(new Cat("Vasya", "gray", 1));
//        cats5.add(new Cat("Nimp", "red", 2));
//        cats5.add(new Cat("Motya", "yellow", 4));

//        var r = cats5.peekFirst();
//        var r = cats5.peekLast();
//        var r = cats5.poll();
//        var r = cats5.pop();
//        cats5.offer(new Cat("Kotler", "blue", 8));
//        cats5.offerFirst(new Cat("Kotler", "blue", 8));
//
//        for (var cat : cats5) {
//            System.out.println(cat);
//        }

//        HashMap<String, Cat> cats6 = new HashMap<>();
//        cats6.put("Vasya", new Cat("Vasya", "gray", 1));
//        cats6.put("Nimp", new Cat("Nimp", "red", 2));
//        cats6.put("Motya", new Cat("Motya", "yellow", 4));
//
//        for (Map.Entry<String, Cat> catEntry : cats6.entrySet()) {
//            System.out.println(catEntry.getKey() + " -> " + catEntry.getValue());
//        }
//
//        var catDuplicate = cats6.get("Motya");
//
//        System.out.println(catDuplicate);
//        System.out.println(catDuplicate.equals(cats6.get("Motya")));
//
//        var motya = cats6.get("Motya");
//        var catDuplicate2 = new Cat(motya.getName(), motya.getColor(), motya.getWeight());
//        System.out.println(catDuplicate2);
//        System.out.println(catDuplicate2.equals(motya));
//        System.out.println(catDuplicate2 == (motya));
//
//        System.out.println("motya.hashcode -> " + motya.hashCode());
//        System.out.println("catDuplicate2.hashcode -> " + catDuplicate2.hashCode());

        HashSet<Cat> cats7 = new HashSet<>();
        cats7.add(new Cat("Vasya", "gray", 1));
        cats7.add(new Cat("Vasya", "gray", 1));
        cats7.add(new Cat("Vasya", "gray", 1));
        cats7.add(new Cat("Nimp", "red", 2));
        cats7.add(new Cat("Motya", "yellow", 4));

        var motya = new Cat("AMotya42", "purple", 42);
        cats7.add(motya);

        System.out.println(cats7);
        for (var cat : cats7) {
            System.out.println(cat);
        }

        var cats8 = new TreeSet<>(
                Comparator.comparing(Cat::getName)
        );
        for (var cat : cats7) {
            cats8.add(cat);
        }

        System.out.println("");
        for (var cat : cats8) {
            System.out.println(cat);
        }

        logger.info("finished...");
    }
}
