package ru.eskendarov.ea.task.three;

public class Farmer {

    <T extends Fruit> void shiftFruits(Box<T> source, Box<T> target) {
        while (source.getWeight() != 0) {
            T fruit;
            fruit = source.get();
            System.out.println(toString()+" перекладывает " + fruit.toString() + " из одной коробки в другую");
            target.add(fruit);
        }
    }

    @Override
    public String toString() {
        return "Фермер";
    }
}