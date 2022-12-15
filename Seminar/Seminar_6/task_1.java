package Java_L_S_D.Seminar.Seminar_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// 1. Создайте HashSet, заполните его следующими числами: {1,2,3,2,4,5,6,3}.
// Распечатайте содержимое данного множества.

// 2. Создайте LinkedHashSet, заполните его следующими числами: {1,2,3,2,4,5,6,3}.
// Распечатайте содержимое данного множества.

// 3. Создайте TreeSet, заполните его следующими числами: {1,2,3,2,4,5,6,3}.
// Распечатайте содержимое данного множества.

public class task_1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,2,3,2,5,4,6,3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(array));
        System.out.println(set1);

        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(array));
        System.out.println(set2);

        Set<Integer> set3 = new TreeSet<>(Arrays.asList(array));
        System.out.println(set3);

    }
}
