package ru.eskendarov.ea;

/*
 *   Написать метод, который меняет два элемента массива местами,
 *   массив может быть любого ссылочного типа.
 *
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CastlingOfElements {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Ночь", "Улица",
                "Фонарь", "Аптека", "Задача", "Книга", "Библиотека"));

        List<Integer> integers = new ArrayList<>(Arrays.asList(-244, 566, 35, 0, -200, 446, 324, 2));

        System.out.println(strings);
        toSwap(strings, 3, 6);
        System.out.println(strings);

        System.out.println(integers);
        toSwap(integers, 0, 3);
        System.out.println(integers);
    }

    //    Метод меняет два элемента в списке местами
    private static <E> void toSwap(List<E> list, final int element1, final int element2) {
        try {
            E e1 = list.get(element1);
            E e2 = list.get(element2);
            list.set(element1, e2);
            list.set(element2, e1);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Задан индекс за пределами массива: " + e);
        }
    }
}