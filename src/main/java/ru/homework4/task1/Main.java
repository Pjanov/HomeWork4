package ru.homework4.task1;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Задача №1
 * Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый” список.
 */
public class Main {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        Collections.addAll(names, "Maksim", "Alexander", "Vasilisa");

        System.out.println(getInvertedList(names));
    }

    /**
     * <h3>Перевернуть список</h3>
     *
     * @param names список элементов
     * @return перевернутый список
     */
    private static LinkedList<String> getInvertedList(LinkedList<String> names) {
        LinkedList<String> res = new LinkedList<>();
        while (!names.isEmpty()) {
            res.add(names.pollLast());
        }
        return res;
    }
}
