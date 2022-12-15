package Java_L_S_D.Seminar.Seminar_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в котром передайте заполеннный выше массив и с помощью Set 
// вычислите его в виде числа с плавающей запятой.
// Для вычисления процента используется формула:
// Процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

public class task_2 {
    public static void main(String[] args) {
        

        
        System.out.println(unicZnach(generateArray(1000, 0, 24)));

    }

    public static Integer[] generateArray(int size, int min, int max) {
        Random rnd = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static double unicZnach(Integer[] array) {
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        System.out.println(Arrays.toString(array));
        System.out.println(set);
        return set.size() * 100.0 / array.length;
    }

}
