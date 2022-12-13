package Java_L_S_D.DZ.DZ_5;

import java.util.Random;
import java.util.Scanner;


// Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class task_3 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        String strLength = sk.nextLine();


        int size = 0;
        while (size == 0) {
            try {
                size = Integer.parseInt(strLength);
            } catch (Exception ex) {
                System.out.println("Ошибка!!! Повторите ввод: ");
                strLength = sk.nextLine();
            }
        }


        int[] array = getArray(size);
        print(array);


        System.out.println();


        Heap_Sort(array);
        print(array);
    }



    public static int[] getArray(int size) {
        int[] array = new int[size];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1, 100);
        }

        return array;
    }



    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }



    public static void Heap_Sort (int[] array) {
        int size = array.length;
        for (int i = size / 2 - 1; i >= 0; i--) {
            Heap(array, size, i);
        }
        for (int i = size - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            Heap(array, i, 0);
        }
    }
    public static void Heap (int[] array, int size, int i) {
        int top = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < size && array[left] > array[top]) {
            top = left;
        }
        if (right < size && array[right] > array[top]) {
            top = right;
        }
        if (top != i) {
            int temp = array[i];
            array[i] = array[top];
            array[top] = temp;
            Heap(array, size, top);
        }
    }
}
