package Java_L_S_D.DZ.DZ_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

// Пусть дан список сотрудников:

// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// 
// Написать программу, которая найдет и выведет повторяющиеся имена 
// с количеством повторений. Отсортировать по убыванию популярности.


public class task_2 {
    public static void main(String[] args) {
        String[] array = {"Мария Савина", "Светлана Петрова", "Иван Ежов", "Анна Крутова", "Иван Мечников", "Кристина Белова", "Илья Петин", "Анна Мусина", "Анна Владимирова", "Илья Акунин"};
        
        ArrayList <String> staf = new ArrayList<>(Arrays.asList(array));
        TreeMap <Double, String> list = new TreeMap<>(Collections.reverseOrder());
        
        for (int i = 0; i < staf.size(); i++) {
            String[] nameSurname_1 = staf.get(i).split(" ");

            String name_1 = nameSurname_1[0];

            double count = 0;
            for (int j = 0; j < staf.size(); j++) {
                String[] nameSurname_2 = staf.get(j).split(" ");
                String name_2 = nameSurname_2[0];
                
                if (name_1.equals(name_2)) {
                    count ++;
                }
            }
            if(count > 1)
                {
                    if (!list.containsValue(name_1)) {
                        while(list.containsKey((double)count))
                            {
                                count += 0.1;
                            }
                        list.put(count, name_1);
                    }
                }
        }
        for (var el : list.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
    }
}
