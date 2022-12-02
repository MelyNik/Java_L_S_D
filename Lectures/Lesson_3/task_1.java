package Java_L_S_D.Lectures.Lesson_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

        // add(args) - Добавляет элемент в список (в том числе на нужную позицию). 
        // get(pos) - Возвращает элемент из списка по указанной позиции. 
        // indexOf(item) - Первое вхождение или -1. 
        // lastIndexOf(item) - Последнее вхождение или -1.
        // remove(pos) - Удаление элемента на указанной позиции и его возвращение. 
        // set(int pos, T item) - Помещает значение item элементу, который находится на позиции pos.
        // void sort(Comparator) - Сортирует набор данных по правилу.
        // subList(int start, int end) - Получение набора данных от позиции start до end.

        // int day = 29;
        // int month = 9;
        // int year = 1990;
        // Integer[] date = {day, month, year};
        // List<Integer> d = Arrays.asList(date);
        // System.out.println(d); // [29, 9, 1990]

        // Более сложный вариант со StringBuilder.

        StringBuilder day = new StringBuilder("29");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = new StringBuilder[]{day, month, year}; // Формируем массив.
        List<String> d = Arrays.asList(date); // На основании массива формируем коллекцию.
        System.out.println(d); // [29, 9, 1990]
        date[1] = new StringBuilder("09"); // После изменения элемента массива
        System.out.println(d); // [29, 09, 1990] // так же будет изменена коллекция.


        // Коллекции Функционал.

        // clear() - Очистка списка.
        // toString() - "Конвертация" списка в строку.
        // Arrays.asList - Преобразует массив в список. 
        // containsAll(col) - Проверяет включение всех элементов из col. 
        // removeAll(col) - Удаляет элементы, имеющееся в col. 
        // retainAll(col) - Оставляет элементы, имеющееся в col. 
        // toArray() - Конвертация списка в массив Object'ов. 
        // toArray(type array) - Конвертация списка в массив type. 
        // List.copyOf(col) - Возвращает копию списка на основе имеющегося. 
        // List.of(item1, item2,...) - Возвращает неизменяемый список.



        Character balue = null;
        List<Character> list12 = List.of('S', 'e', 'r', 'g'); // Создали не имзменяемый список.
        System.out.println(list12);
        list12.remove(1); // Попытались удалить из неизменяемого списка первый элемент (Произошла ошибка)
                                // так как из неимзменяемого списка через List.of нельзя, что то изменить.
        // java.lang.UnsupportedOperationException
        List<Character> list22 = List.copyOf(list12);





        // Интератор:

        List<Integer> list123 = List.of(1, 12,123, 1234, 12345);

        for (int item : list)
            {
                System.out.println(item);
            }
        
        Iterator<Integer> col = list.iterator();
        System.out.println();

        // Цикл будет зациклин пока col есть элементы, а в цикле можем удалять эти элементы.
        while(col.hasNext())
            {
                System.out.println(col.next());
                col.next();
                col.remove();
            }
    }
}
