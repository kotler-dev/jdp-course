package dev.kotler.catpack;

import java.util.Objects;

public class Cat {
    private String name;
    private String color;
    private int weight;

    public Cat(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "name=%s, color=%s, weight=%s, hashcode=%s".formatted(name, color, weight, this.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && name.equals(cat.name) && color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, weight);
    }
}
