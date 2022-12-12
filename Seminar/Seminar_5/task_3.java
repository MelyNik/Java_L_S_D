package Java_L_S_D.Seminar.Seminar_5;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

// Взять набор строк, например, Мороз и солнце день чудесный Ещё ты дремлешь
// друг прелестный Пора красавица проснись.

// Написать метод, который отсротирует эти строки по длине с помощью TreeMap.
// Строки с одинаковой длиной не должны "потерятся".

public class task_3 {
    public static void main(String[] args) {
        SortMap();
    }

    //public static void SortMap() {
    //    String s = "Мороз и солнце день чудесный Ещё ты дремлешь друг прелестный Пора красавица проснись.";
    //    TreeMap<Double, String> list = new TreeMap<>();
    //    String[] str = s.split(" ");
    //    for(int i = 0; i < str.length; i++)
    //        {
    //            if(list.containsKey((double)str[i].length()))
    //                {
    //                    list.put(str[i].length() + 0.00000001 * i, str[i]);
    //                }
    //            else
    //                {
    //                    list.put((double)str[i].length(), str[i]);
    //                }
    //        }
    //    for (var el : list.entrySet()) {
    //        System.out.println(el.getKey() + " " + el.getValue() + "\n");
    //    }
    //}
    public static void SortMap() {
        String s = "Мороз и солнце день чудесный Ещё ты дремлешь друг прелестный Пора красавица проснись.";
        TreeMap<Integer, List> list = new TreeMap<>();
        String[] array = s.split(" ");
        for(int i = 0; i < array.length; i++)
            {
                if(list.containsKey(array[i].length()))
                    {
                        list.get(array[i].length()).add(array[i]);
                    }
                else
                    {
                        ArrayList<String> lst = new ArrayList<>();
                        lst.add(array[i]);
                        list.put(array[i].length(), lst);
                    }
            }
        
        

        for (var el : list.entrySet()) {
                System.out.println(el.getKey() + " " + el.getValue() + "\n");
        }
    }
}
