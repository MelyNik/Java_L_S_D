package Java_L_S_D.Seminar.Seminar_4;
/*
Реализовать консольное приложение, которое:

1.Принимаетот пользователя и "запоминает" строки.
2.Если введено print. выводит строки так, чтобы последняя была первой в списке, а первая - последней.
3.Если введено revert, удаляет предыдущую введенную строку из памяти.

*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        Deque<String> line = new ArrayDeque<>();

        while(true)
            {
                System.out.println("Введите строку: \n");
                String str = sk.nextLine();
                if(str.equals(""))
                    {
                        break;
                    }
                else if(str.equals("print"))
                    {
                        while(!line.isEmpty())
                            {
                                System.out.print(line.removeLast() + " ");
                            }
                    }
                else if(str.equals("revert"))
                    {
                        line.removeLast();
                    }
                else 
                    {
                        line.add(str);
                    }
            }
        
        System.out.println(line);
    }
}
