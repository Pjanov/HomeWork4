package ru.homework4.task2;

import java.util.Collections;
import java.util.LinkedList;

public class MyQueue {
    private static LinkedList<String> queue = new LinkedList<>();

    public static void main(String[] args) {

        Collections.addAll(queue, "Bananas", "Apples", "Mandarins");

        add("hello", queue); //добавить в конец
        System.out.println(top(queue)); //посмотреть первое в очереди
        System.out.println(remove(queue)); //удалить и вернуть первое в очереди
    }

    /**
     * <h3>Добавить элемент в конец списка</h3>
     *
     * @param str строка
     * @param col список
     */
    private static void add(String str, LinkedList<String> col) {
        col.offer(str);
    }

    /**
     * <h3>Посмотреть первый элемент в очереди</h3>
     *
     * @param col список
     * @return первый элемент
     */
    private static String top(LinkedList<String> col) {
        return col.peek();
    }

    /**
     * <h3>Удалить и вернуть первое в очереди</h3>
     *
     * @param col список
     * @return первый элемент
     */
    private static String remove(LinkedList<String> col) {
        return col.remove();
    }
}
