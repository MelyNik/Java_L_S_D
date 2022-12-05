package Java_L_S_D.DZ.DZ_3;

import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа.

public class Dz_2 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int size = rnd.nextInt(3, 10);
        ArrayList <Integer> list = getList(size);

        System.out.println("Дан список произвольных чисел: ");
        System.out.println(list);

        list = sortList(list);

        System.out.println("Список отсортерован без чётных чисел: ");
        System.out.println(list);
    }

    public static ArrayList <Integer> getList(int size) {
        ArrayList <Integer> list = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(100));
        }
        return list;
    }

    public static ArrayList <Integer> sortList (ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}