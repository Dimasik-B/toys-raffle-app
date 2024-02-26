package com.github.dimasik_b.model;

public class Toy implements Comparable<Toy> {

    String id;
    String name;
    String dropChance;

    public Toy(String id, String name, String value) {
        this.id = id;
        this.name = name;
        this.dropChance = value;
    }

    public String getId() {
        return id;
    }

    public String getDropChance() {
        return dropChance;
    }

    public void setDropChance(String dropChance) {
        this.dropChance = dropChance;
    }

    @Override
    public String toString() {
        return  "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", drop chance='" + dropChance + '\'';
    }

    @Override
    public int compareTo(Toy o) {
        return Integer.compare(Integer.parseInt(this.dropChance), Integer.parseInt(o.dropChance));
    }
}
