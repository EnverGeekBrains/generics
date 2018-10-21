package ru.eskendarov.ea.task.three;

/**
 * Есть классы Fruit -> Apple, Orange (больше фруктов не надо);
 * Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * Для хранения фруктов внутри коробки можно использовать ArrayList;
 * Сделать метод getWeight(), который высчитывает вес коробки,
 * зная количество фруктов и вес одного фрукта (вес яблока – 1.0f, апельсина – 1.5f. Не важно, в каких это единицах);
 * Внутри класса Коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
 * которую подадут в compare в качестве параметра, true – если она равны по весу,
 * false – в противном случае (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
 * Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую(
 * помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами).
 * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
 * Не забываем про метод добавления фрукта в коробку.
 */

public class Village {
    public static void main(String[] args) {
        final Apple apple1 = new Apple();
        final Apple apple2 = new Apple();
        final Apple apple3 = new Apple();
        final Apple apple4 = new Apple();
        final Apple apple5 = new Apple();
        final Apple apple6 = new Apple();

        final Box<Apple> appleBox1 = new Box<>();
        appleBox1.add(apple1, apple2, apple3, apple4, apple5, apple6);

        final Orange orange1 = new Orange();
        final Orange orange2 = new Orange();
        final Orange orange3 = new Orange();

        final Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.add(orange1, orange2, orange3);

//        Уравним вес коробок
//        orangeBox1.add(new Orange());

        System.out.printf("Вес коробки с яблоками: %.2f \n\r", appleBox1.getWeight());
        System.out.printf("Вес коробки с апельсинами: %.2f \n\r", orangeBox1.getWeight());

        boolean b = appleBox1.compare(orangeBox1);
        System.out.println(b);

        final Box<Apple> appleBox2 = new Box<>();
        final Box<Orange> orangeBox2 = new Box<>();

        final Farmer farmer = new Farmer();
        farmer.shiftFruits(appleBox1, appleBox2);
        farmer.shiftFruits(orangeBox1, orangeBox2);

        System.out.printf("Вес новой коробки с яблоками %s, а старой %s \n\r",
                appleBox2.getWeight(), appleBox1.getWeight());
        System.out.printf("Вес новой коробки с апельсинами %s, а старой %s \n\r",
                orangeBox2.getWeight(), orangeBox1.getWeight());
    }
}