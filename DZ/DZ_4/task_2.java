package Java_L_S_D.DZ.DZ_4;

import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class task_2 {
    public static void main(String[] args) {
        LinkedList <String> listArray = new LinkedList<>();

        for (int i = 0; i < 4; i++) {
            EnqueueList(listArray);
        }
        System.out.println("Поместили элементы в конец очереди.");
        System.out.println(listArray);


        System.out.println("Вернули первый элемент из очереди и удалили его.");
        System.out.println(DequeueList(listArray));
        

        System.out.println("Возвращаем первый элемент из очереди, не удаляя.");
        System.out.println(FirstList(listArray));
    }

    public static LinkedList <String> EnqueueList (LinkedList<String> listArray) {
        Scanner sk = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = sk.nextLine();

        listArray.add(str);
        return listArray;
    }

    public static LinkedList <String> DequeueList (LinkedList<String> listArray) {
        String str = listArray.get(0);
        System.out.println(str);

        listArray.remove(0);
        return listArray;
    }

    public static LinkedList <String> FirstList(LinkedList<String> listArray) {
        String str = listArray.get(0);
        System.out.println(str);
        
        return listArray;
    }
}
