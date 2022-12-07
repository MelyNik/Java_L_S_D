package Java_L_S_D.Seminar.Seminar_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class task_4 {
    public static void main(String[] args) {
        String[] base = {"one", "two", "three", "four", "five"};

        Queue<String> queuArr = new LinkedList<>(Arrays.asList(base));

        Deque<String> dqueuArr = new LinkedList<>(Arrays.asList(base));
        System.out.println("Очередь");
        while (!queuArr.isEmpty()) {
            System.out.println(queuArr.poll() + " ");
        }
        System.out.println("\nСтэк");
        while(!dqueuArr.isEmpty()) {
            System.out.println(dqueuArr.pollLast() + " ");
        }
    }
}
