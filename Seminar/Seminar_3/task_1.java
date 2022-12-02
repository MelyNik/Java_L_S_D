package Java_L_S_D.Seminar.Seminar_3;

import java.util.*;

// Заполнить список названием планет Солничной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.
public class task_1 {
    public static void main(String[] args) {
        String[] planets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        Random rnd = new Random();
        ArrayList<String> pla = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            pla.add(planets[rnd.nextInt(0,planets.length - 1)]);
        }
        for (String i : pla) {
            System.out.print(i + " ");
        }
        System.out.println();
        // for (int i = 0; i < pla.toArray().length; i++) {
        //     if(pla.get[i] == pla[i+1])
        // }

        Set<String> mySet = new HashSet<>(pla);                          // Создали счётчик
        for (String s : mySet) {                                         // одинаковых элементов
            System.out.println(s + " " + Collections.frequency(pla, s)); // в массиве.
        }

    }
} 

