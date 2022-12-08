package Java_L_S_D.Lectures.Lesson_5;

import java.util.HashMap;
import java.util.Map;

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

        // put(K,V) - Добавить пару если или изменить значение, если ключ имеется. 
        // putIfAbsent(K,V) - Произвести добавление если ключ не найден. 
        // get(K) - Получение значения по указанному ключу. 
        // remove(K) - Удаляет пару по указанному ключу. 
        // containsValue(K) - Проверка наличия значения. 
        // containsKey(K) - Проверка наличия ключа.
        // keySet(K) - Возвращает множество ключей. 
        // value() - Возвращает набор значений. 

    }
}
