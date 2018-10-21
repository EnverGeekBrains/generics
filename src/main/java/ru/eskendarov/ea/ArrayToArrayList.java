package ru.eskendarov.ea;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Написать метод, который преобразует массив в ArrayList.
 */

public class ArrayToArrayList {

    public static void main(String[] args) {
        Integer[] ints = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] strings = new String[]{"Один", "Два", "Три", "Четыре"};

        ArrayList<Integer> integerArrayList = toArrayList(ints);
        ArrayList<String> stringArrayList = toArrayList(strings);

        System.out.println(integerArrayList);
        System.out.println(stringArrayList);

    }

    //  Метод преобразует массив с объектами ссылочного типа в ArrayList.
    private static <T> ArrayList<T> toArrayList(T[] array) {
        System.out.println(array.getClass().getName());
        final ArrayList<T> result = new ArrayList<>();
        Collections.addAll(result, array);
        return result;
    }
}