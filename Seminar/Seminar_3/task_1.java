package Java_L_S_D.Seminar.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;


public record task_1() {
    public static void main(String[] args) {
        Random rnd = new Random();
        // ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(4, 5, 67, 78, 4, 3, 5));  
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(rnd.nextInt(100));
        }
        printArray(intList);

        //Collection.sort(intList);
        printArray(intList);

    }
    public static void printArray(ArrayList<Integer> array) {
        StringBuilder print = new StringBuilder();
        for (Integer number : array) {
            print.append(number + ", ");       
        }
        //String result = print.substring(0, print.length() - 2);
        System.out.println(print.substring(0, print.length() - 2));
    }
}
