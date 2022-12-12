package Java_L_S_D.Seminar.Seminar_3;

import java.util.*;

// Заполнить список названием планет Солничной системы в произвольном порядке с повторениями.
// Вывести название планет которые не повторяются.
public class task_3 {
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

//        Collections.sort(pla);
//
//        for (int i = 0; i < pla.size() - 1 ; i++) {
//            if(pla.get(i) == pla.get(i+1))
//            {
//                pla.remove(pla.get(i));
//                i--;
//            }
//        }
//        System.out.println(pla);

        Set<String> mySet = new HashSet<>(pla);  // Создали переменную с неповторяющимеся элементами.
        System.out.println(mySet);

    }
}