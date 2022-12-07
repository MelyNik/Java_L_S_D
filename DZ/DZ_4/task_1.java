package Java_L_S_D.DZ.DZ_4;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет "перевернутый" список.

import java.util.Arrays;
import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) {
        String[] list = {"1", "2", "3", "4", "5", "6"};
        LinkedList <String> listArray = new LinkedList<>(Arrays.asList(list));

        System.out.println("Заданный список: ");
        System.out.println(listArray);


        System.out.println("Перевернутый список: ");
        System.out.println(Revers(listArray));
    }

    public static LinkedList <String> Revers(LinkedList<String> listArray) {
        LinkedList <String> revers = new LinkedList<>();
        for (int i = 0; i < listArray.size(); i++) {
            revers.add(listArray.get(listArray.size()- 1 - i));
        }
        return revers;
    }
}
