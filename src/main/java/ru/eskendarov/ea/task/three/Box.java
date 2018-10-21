package ru.eskendarov.ea.task.three;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Box<T extends Fruit> {

    private final List<T> fruits;

    Box() {
        this.fruits = new LinkedList<>();
    }

    void add(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    double getWeight() {
        if (fruits.size() > 0) {
            return fruits.get(0).getWeight() * fruits.size();
        }
        else return 0;
    }


    boolean compare(Box<? extends Fruit> that) {
        return Math.abs(this.getWeight() - that.getWeight()) < 0.00001;
    }

    <T extends Fruit> T get() {
        return ((LinkedList<T>)fruits).pollLast();
    }
}