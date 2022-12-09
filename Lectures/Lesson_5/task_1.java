package Java_L_S_D.Lectures.Lesson_5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class task_1 {
    public static void main(String[] args) {
        // HashMap . Map - это множество коллекций, работающих с данными по принципу
        // <Ключ/Значение>.
        // Ключевые особенности:
        //     ускоренная обработка дынных;
        //     порядок добавления не запоминается.

        // В HashMap элементы распологаются как угодно и могут 
        // менять своё положение.

        Integer a = 123;
        System.out.println(a.hashCode());
        System.out.println("z".hashCode());

        Map<Integer, String> db = new HashMap<>();// Первый тип данных - тип ключа, второй - значение.
        db.putIfAbsent(1, "один"); // Метод добавления ключа и значения, так одновременно
                                            // проверяет есть ли уже такой ключ или нет.
                                            // Если есть, то ни чего не добавит, если нет то добавит.
        db.put(2, "два"); // Метод добавления информации, указав ключ и значение. Если
                                     // такой ключ уже есть, то данные перезапишутся.
        db.put(null, "!null"); 
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44));
        //db.remove(null); 
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true Проверка значения.
        System.out.println(db.containsValue(1)); // false
        System.out.println(db.containsKey("один")); // false Проверка ключа.
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet()); // Выгрузка всех ключей.
        System.out.println(db.values()); // Выгрузка всех ключей.

        // HashMap Важное дополнение.

        for (var item : db.entrySet()) //  Таким образом проходим по коллекции и выводим все ключи и значения.
        {
            System.out.printf("[%d: %s\n", item.getKey(), item.getValue()); 
        }


        // put(K,V) - Добавить пару если или изменить значение, если ключ имеется. 
        // putIfAbsent(K,V) - Произвести добавление если ключ не найден. 
        // get(K) - Получение значения по указанному ключу. 
        // remove(K) - Удаляет пару по указанному ключу. 
        // containsValue(V) - Проверка наличия значения. 
        // containsKey(V) - Проверка наличия ключа.
        // keySet() - Возвращает множество ключей. 
        // value() - Возвращает набор значений. 


        Map<Integer, String> map1 = new HashMap<>();// Указано 0 количсетво элементов по умолчанию.
        Map<Integer, String> map2 = new HashMap<>(9); // Указано 9 элементов и удваение
                                                                      // провизойдёт после 9-го эоемента.
        Map<Integer, String> map3 = new HashMap<>(9, 1.0f); // Указано 9 элементов
                                                                                        // и 1,0f - это 100 процентов.
                                                                                        // Т.е. после 100 процентов
                                                                                        // заполнения, количество 
                                                                                        // элементов удвоится.
                                                                                        // Если было 0.7f, то получается
                                                                                        // после 70% заполения удвоилось
                                                                                        // бы количество элементов.

        
        
        
        
        // TreeMap - тоже самое, что и HashMap, но будут стоять по порядку по ключу.

        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"один"); 
        System.out.println(tMap); 
        // {1=один}
        tMap.put(6,"шесть"); 
        System.out.println(tMap);
        // {1=один, 6=шесть}
        tMap.put(4,"четыре"); 
        System.out.println(tMap);
        // {1=один, 4=четыре, 6=шесть}
        tMap.put(3,"три"); 
        System.out.println(tMap);
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"два"); 
        System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}


        // LinkedHashMap - сохраняет данные по порядку как они были добавлены. Более медлительный.

        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}

        // Hashtable

        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); 
        //  java.lang.NullPointerException

    }
}
