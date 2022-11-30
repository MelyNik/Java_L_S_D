package Java_L_S_D.Seminar.Seminar_2;

import java.util.Scanner;
// Ввести длину строки.
// В новую строку добавлять символ 'a' если позиция не чётная и символ 'b' если позиция чётная.
public class task_1 {
    public static void main(String[] args) {
        Character c1 = 'a';
        Character c2 = 'b';
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        StringBuilder bild = new StringBuilder();

        for (int i = 0; i < n; i++) 
            {
                if(i % 2 == 0)
                    {
                        bild.append(c1);
                    }
                else
                    {
                        bild.append(c2);
                    }
            }
        System.out.println(bild.toString());
    }
}
