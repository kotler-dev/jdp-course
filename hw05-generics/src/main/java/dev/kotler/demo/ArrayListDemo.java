package dev.kotler.demo;

import dev.kotler.demo.generics.bounds.entries.Animal;
import dev.kotler.demo.generics.bounds.entries.Cat;
import dev.kotler.demo.generics.bounds.entries.HomeCat;
import dev.kotler.demo.generics.bounds.entries.WildCat;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        Cat[] animalArr = new Cat[]{new HomeCat("Murzik"), new WildCat("Vasik"), new HomeCat("42")};
        System.out.println(animalArr[0].getMyau());
        System.out.println(animalArr[1].getMyau());
        System.out.println(Arrays.toString(animalArr));
        List<Cat> catList = new ArrayList<Cat>(Collections.singleton(new HomeCat("Murzik")));
//        List<Cat> catList = Arrays.asList(animalArr);
        catList.add(new HomeCat("1")); // error
//        System.out.println(catList);

        Animal[] catsArr = catList.toArray(new Cat[0]);
//        System.out.println(Arrays.toString(catsArr));

        List<? super Cat> animalListDest = new ArrayList<>(catList);
//        List<? super Cat> animalListDest = List.of(catList);
        animalListDest.add(new HomeCat("NewCat"));
//        Collections.copy(animalListDest, catList);
//        catList.addAll((Collection<? extends Cat>) animalListDest);
        animalListDest.addAll(catList);
        System.out.println(animalListDest);

        Set<Cat> catDubl = new HashSet<Cat>((Collection<? extends Cat>) animalListDest.stream().toList());
        System.out.println(catDubl);

        List<Cat> newCats = new ArrayList<>();
        newCats.add(new WildCat("pantera"));

        List<Cat> superCats = new ArrayList<>(newCats);
        Collections.copy(superCats, newCats);

        WildCat p = (WildCat) superCats.get(0);
        p.setName("leon");

        System.out.println("New Cat: " + newCats.get(0).toString());
    }
}
