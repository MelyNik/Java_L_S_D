package Java_L_S_D.Lectures.Lesson_4;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class task_1 {
    public static void main(String[] args) {
        
        
        
        // Коллекция LinkedList   -   Представляет собой двусвязный список.
        
        // Функционал как и в ArrayList.
        LinkedList<Integer> intList = new LinkedList<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);


        // Коллекция Queue   -   Обрабатывается по очереди с начала. Зависит от LinkedList.
        Queue<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int inem = list.remove(); // Удалится первый элемент который был первым добавлен, так как в Queue
                                  // данные обрабатывается по очереди с начала.
        
        
        // PriorityQueue - ответвление Queue, т.е. работа начинается не с первого элемента по очереди
        //                  а с меньшего элемента из всей очереди и по порядку.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        System.out.println(pq);
        System.out.println(pq.poll());  // Выводим каждое число по отдельности и по порядку.
        System.out.println(pq.poll());  // Выводим каждое число по отдельности и по порядку.
        System.out.println(pq.poll());  // Выводим каждое число по отдельности и по порядку.
    }
}
