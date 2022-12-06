package Java_L_S_D.Lectures.Lesson_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

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
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(123);
        queue.add(3);
        queue.add(13);
        System.out.println(queue);
        System.out.println(queue.poll());  // Выводим каждое число по отдельности и по порядку.
        System.out.println(queue.poll());  // Выводим каждое число по отдельности и по порядку.
        System.out.println(queue.poll());  // Выводим каждое число по отдельности и по порядку.
        int item = queue.remove();
        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
        item = queue.remove();
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.remove();
        System.out.println(queue); // [2809]
        System.out.println(queue.peek());

        // Deque - double endexe queue - данные можно добавлять и в начало и в конец, а так же 
        //                               обработку данных не только с начала, но и с конца.

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.removeLast(); deque.removeLast();
        deque.offerFirst(1); deque.offerLast(2);
        deque.pollFirst(); deque.pollLast();
        deque.getFirst(); deque.getLast();
        deque.peekFirst(); deque.peekLast();

        // Stack - принцип в том, что обрабатывает, то, что пришло в первую очередь будет обработано 
        //         в последнюю очередь. Аналог рекурсии.

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1


    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void mai(String[] args) {

        var exp = "1 2 3 * +".split(" "); 

        int res = 0;
        System.out.println(exp);
        
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}
