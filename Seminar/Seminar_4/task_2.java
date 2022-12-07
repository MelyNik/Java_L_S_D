package Java_L_S_D.Seminar.Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String line = sk.nextLine();

        LinkedList<String> linkL = new LinkedList<>();
        String[] arr = line.split("~");

        int ind = Integer.parseInt(arr[1]);
        for (int i = 0; i < ind * 2; i++) {
            linkL.add("Строка" + i);
        }

        if(arr[0].equals("print"))
            {
                System.out.println(linkL.remove(ind));
            }
        else
            {
                linkL.add(ind, arr[0]);
            }

        System.out.println(linkL);
    }
}
