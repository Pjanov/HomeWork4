package ru.homework4.task3;

import java.util.Collections;
import java.util.LinkedList;

public class MyStack {
    private static LinkedList<String> stack = new LinkedList<>();

    public static void main(String[] args) {

        Collections.addAll(stack, "cars", "people", "machines");

        push("hello", stack); //добавить в конец
        System.out.println(peek(stack)); //посмотреть последнее в стеке
        System.out.println(pop(stack)); //удалить и извлечь последнее в стеке
    }

    /**
     * <h3>Добавить элемент в конец стека</h3>
     *
     * @param str строка
     * @param col список
     */
    private static void push(String str, LinkedList<String> col) {
        col.push(str);
    }

    /**
     * <h3>Посмотреть на верхний элемент в стеке</h3>
     *
     * @param col список
     * @return последний элемент в стеке
     */
    private static String peek(LinkedList<String> col) {
        return col.peek();
    }

    /**
     * <h3>Удалить и вернуть последний в стеке</h3>
     *
     * @param col список
     * @return удаляет и возвращает последний элемент в стеке
     */
    private static String pop(LinkedList<String> col) {
        return col.pop();
    }
}
