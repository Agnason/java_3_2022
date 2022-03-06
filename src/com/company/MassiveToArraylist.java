package com.company;

import java.util.ArrayList;

public class MassiveToArraylist<T> {

    // написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа)
    public static <T> void swapFromTo(T[] arr, int indexFrom, int indexTo) {
        T val = null;
        val = arr[indexFrom];
        arr[indexFrom] = arr[indexTo];
        arr[indexTo] = val;
    }

    public static <Т> void print(Т[] array) {
        for (Т element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // написать метод, который преобразует массив в ArrayList
    public static <T> ArrayList<T> change(T[] array) {
        ArrayList<T> tArrayList = new ArrayList<>();
        for (T i : array) {
            tArrayList.add(i);
        }
        return tArrayList;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        String[] strings = new String[]{"Маша", "Оля", "Петя", "Вася"};
        print(arr);
        swapFromTo(arr, 2, 1);
        print(arr);
        print(strings);
        swapFromTo(strings, 1, 0);
        print(strings);
        System.out.println(change(arr));
        System.out.println(change(strings));

    }

}
