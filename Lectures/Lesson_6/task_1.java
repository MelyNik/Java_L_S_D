package Java_L_S_D.Lectures.Lesson_6;

import java.util.Arrays;
import java.util.HashSet;

public class task_1 {
    public static void main(String[] args) {
        // HashSet

        //isEmpty() - Проверка на пустоту. 
        //add(V) - Добавление элемента в коллекцию. 
        //remove(V) - Удаление элемента из коллекции. 
        //contains(V) - Проверка на ключение элемента в коллекцию. 
        //clear() - Удаление всех элементов коллекции. 
        //size() - Возвращает количество элементов коллекции. 
        
        // addAll(Coll) - Объединение множеств. 
        // retainAll(Coll) - Пересечение множеств. 
        // removeAll(Coll) - Разность множеств. 



        // LinkedHashSet

        // isEmpty() - Проверка на пустоту. 
        // add(V) - Добавление элемента в коллекцию. 
        // remove(V) - Удаление элемента из коллекции. 
        // contains(V) - Проверка на ключение элемента в коллекцию. 
        // clear() - Удаление всех элементов коллекции. 
        // size() - Возвращает количество элементов коллекции.

        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w2 = new Worker();
        w1.firstName = "Имя_2";
        w1.lastName = "Фамилия_2";
        w1.salary = 200;
        w1.id = 2000;

        Worker w3 = new Worker();
        w1.firstName = "Имя_3";
        w1.lastName = "Фамилия_3";
        w1.salary = 300;
        w1.id = 3000;

        System.out.println(w1.toString());
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));

        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));



    }
}
