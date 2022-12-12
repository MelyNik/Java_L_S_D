package Java_L_S_D.DZ.DZ_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

public class task_1 {
    public static void main(String[] args) {
        String[] array = {"Андрей 564648564", "Алексей 5615646", "Владислав 1234535", "Сергей 54165456"};
        
        ArrayList <String> human = new ArrayList<>(Arrays.asList(array));
        HashMap <String, ArrayList<Integer>> numberTelephone = new HashMap<>();

        for (int i = 0; i < human.size(); i++) {
            String[] str = human.get(i).split(" ");
            String key = str[0];
            int number = Integer.parseInt(str[1]);

            ArrayList <Integer> list = new ArrayList<>();
            list.add(number);
            
            if (numberTelephone.containsKey(key)) {
                list.add(number);
                numberTelephone.put(key, list);
            } else {
                numberTelephone.put(key, list);
            }
        }
        System.out.println(numberTelephone);
    }
}
