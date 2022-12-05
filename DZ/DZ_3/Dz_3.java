package Java_L_S_D.DZ.DZ_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.

public class Dz_3 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int size = rnd.nextInt(3, 10);
        ArrayList <Integer> list = getList(size);

        System.out.println("Задан целочисленный список: ");
        System.out.println(list);

        array(list);

    }
    public static ArrayList <Integer> getList(int size) {
        ArrayList <Integer> list = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(100));
        }
        return list;
    }
    public static void array(ArrayList<Integer> list) {
        Collections.sort(list);
        System.out.println(list);

        int numberMin = list.get(0);
        int numberMax = list.get(list.size()-1);
        int arithmeticMean = (numberMin + numberMax) / 2; 

        int number_3 = 0;
        for (int i = 1; i < list.size() - 1; i++) {
            if(list.get(1) >= arithmeticMean)
                {
                    number_3 = list.get(1);
                    System.out.printf("Значения: минимальное - %d, максимальное - %d, среднее - %d\n", numberMin, numberMax, number_3);
                }
            else if(list.get(list.size() - 2) <= arithmeticMean)
                {
                    number_3 = list.get(list.size() - 2);
                    System.out.printf("Значения: минимальное - %d, максимальное - %d, среднее - %d\n", numberMin, numberMax, number_3);
                }
            else if(list.get(i) >= arithmeticMean && list.get(i - 1) <= arithmeticMean)
                {
                    int firstI = arithmeticMean - list.get(i-1);
                    int secondI = (arithmeticMean - list.get(i)) * (-1);
                    if(firstI < secondI)
                        {
                            number_3 = list.get(i-1);
                            System.out.printf("Значения: минимальное - %d, максимальное - %d, среднее - %d\n", numberMin, numberMax, number_3);
                        }
                    else
                        {
                            number_3 = list.get(i);
                            System.out.printf("Значения: минимальное - %d, максимальное - %d, среднее - %d\n", numberMin, numberMax, number_3);
                        }
                }
        }
    }
}
