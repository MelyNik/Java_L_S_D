package Java_L_S_D.Seminar.Seminar_4;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> qw = new ArrayList<>();
        LinkedList<Integer> lI = new LinkedList<>();
        LocalTime timeStart = LocalTime.now();

        for (int i = 0; i < 1000000; i++) {
            qw.add(i);
        }

        LocalTime timeStop = LocalTime.now();
        Duration diff = Duration.between(timeStart, timeStop); // Нахдоим разницу времени.
        System.out.println("Время Deueu: "+diff);

        timeStart = LocalTime.now();

        for (int i = 0; i < 1000000; i++) {
            lI.add(i);
        }

        timeStop = LocalTime.now();
        diff = Duration.between(timeStart, timeStop); // Находим разницу времени.
        System.out.println("Время LinkedList: "+diff);
    }
}
