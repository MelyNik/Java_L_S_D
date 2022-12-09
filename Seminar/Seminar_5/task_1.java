package Java_L_S_D.Seminar.Seminar_5;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

// Создать структуру для хранения Номеров паспартов и Фамилий
// сотрудников организации.

// 123456 Иванов
// 321456 Васильев
// 234561 Петров
// 234432 Иванов
// 654321 Петров
// 345678 Иванов

// Вывести данные по сотрудникам с фамилией Иванов.

public class task_1 {
    public static void main(String[] args) {
        Map<Integer, String> list = new HashMap<>();
        // String encoding = System.getProperty("console.encoding", "cp866"); // Изменение кодировки, где cp866 и есть кодировка.
        // Scanner sk = new Scanner(System.in, encoding);
        Scanner sk = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите паспорт и фамилию: ");
            String str = sk.nextLine();
            String[] array = str.split(" ");
            list.put(Integer.parseInt(array[0]), array[1]);
        }
        for (var empti : list.entrySet()) {
            System.out.print(empti.getKey() + " " + empti.getValue() + "\n");
        }
        sk.close();
        System.out.println();
        for (var empti : list.entrySet()) {
            if(empti.getValue().equals("Иванов"))
                {
                    System.out.print(empti.getKey() + " " + empti.getValue() + "\n");
                }
        }

    }
}
