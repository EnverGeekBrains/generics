package ru.eskendarov.ea.task.three;

public abstract class Fruit {

    final private double weight;

    Fruit(double weight) {
        this.weight = weight;
    }

    double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Фрукт";
    }
}