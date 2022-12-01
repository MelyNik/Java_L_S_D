package Java_L_S_D.Lectures.Lesson_3;

import java.util.ArrayList;

public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // Если сразу указать тпи данных например <Integer>
                                                            // то ошибок ни каких не будет.
        // Если указывать <Integer>, то в list.add можем добавлять только <Integer>.
        // Если не указывать тип данных вообще, то можно использовать разные типы данных.
        list.add(2809); // Не явно 2809 преобразовываем в Object, так как раньше не объявляли, что массив может быть Object.

        for (Object o : list) {
            System.out.println(o);
        }

        // Правильная работа с коллекциями (Разные способы):
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10); // Выделено в массиве 10 мест под элементы.
        ArrayList<Integer> list4 = new ArrayList<>(list3); // Копирование данных на основании другой коллекции.
    }
}
