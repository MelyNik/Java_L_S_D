package Java_L_S_D.Seminar.Seminar_4;

import java.time.LocalTime;
import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> lI = new LinkedList<>();
        LocalTime timeStart = LocalTime.now();

        for (int i = 0; i < 1000000; i++) {
            lI.add(i);
        }

        LocalTime timeStop = Del LocalTime.now();

        System.out.println("Время Deueu: " );

    }
}
