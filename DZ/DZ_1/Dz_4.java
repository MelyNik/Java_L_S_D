package Java_L_S_D.DZ.DZ_1;

import java.util.ArrayList;
// *+Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, 
// например 2? + ?5 = 69. Требуется восстановить выражение 
// до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
import java.util.Scanner;
public class Dz_4 {
    public static void main(String[] args) {
        //Scanner iScanner = new Scanner(System.in);
        //System.out.println("Задайте уравнения типа q + w = e. Введите q: ");
        //String q_String = iScanner.nextLine();
        //StringBuilder q = new StringBuilder(q_String);
//
        //System.out.println("Введите w: ");
        //String w_String = iScanner.nextLine();
        //StringBuilder w = new StringBuilder(w_String);
//
        //System.out.println("Введите e: ");
        //String e_String = iScanner.nextLine();
//
        //int q_Int = 0;
        //int index_q = 0;
        //try {
        //    q_Int = Integer.parseInt(q_String);
        //}
        //catch (NumberFormatException nException) {
        //    for(int i = 0; i < q_String.length(); i++) {
        //            if (String.valueOf(q_String.charAt(i)).equals("?")) {
        //                index_q = i; 
        //            }
        //    }
        //}
        //
        //int w_Int = 0;
        //int index_w = 0;
        //try {
        //    w_Int = Integer.parseInt(w_String);
        //}
        //catch (NumberFormatException nException) {
        //    for(int i = 0; i < w_String.length(); i++) {
        //            if (String.valueOf(w_String.charAt(i)).equals("?")) {
        //                index_w = i; 
        //            }
        //    }
        //}
//
        //int e_Int = Integer.parseInt(e_String);
//
        //if (q_Int == 0 && w_Int != 0) {
        //    for (int j = 1; j <= 9; j++) {
        //        String count = Integer.toString(j);
        //        q.setCharAt(index_q, count.charAt(0));
        //        q_String = q.toString();
        //        q_Int = Integer.parseInt(q_String);
        //        if(q_Int + w_Int == e_Int) {
        //            break;
        //        }
        //    }
        //}
        //else if (q_Int != 0 && w_Int == 0) {
        //    for (int j = 1; j <= 9; j++) {
        //        String count = Integer.toString(j);
        //        w.setCharAt(index_w, count.charAt(0));
        //        w_String = w.toString();
        //        w_Int = Integer.parseInt(w_String);
        //        if(q_Int + w_Int == e_Int) {
        //            break;
        //        }
        //    }
        //}
        //else if (q_Int == 0 && w_Int == 0) {
        //    for (int j = 1; j <= 9; j++) {
        //        String count = Integer.toString(j);
        //        q.setCharAt(index_q, count.charAt(0));
        //        q_String = q.toString();
        //        q_Int = Integer.parseInt(q_String);
        //        for(int i = 1; i <= 9; i++) {
        //            String count1 = Integer.toString(i);
        //            w.setCharAt(index_w, count1.charAt(0));
        //            w_String = w.toString();
        //            w_Int = Integer.parseInt(w_String);
        //            if((q_Int + w_Int) == e_Int) {
        //                break;
        //            }
        //        }
        //        if((q_Int + w_Int) == e_Int) {
        //            break;
        //        }
        //    }
        //}
//
        //if(q_Int + w_Int == e_Int) {
        //    System.out.printf("%d + %d = %d", q_Int, w_Int, e_Int);
        //}
        //else {
        //    System.out.println("Нет вариантов для равенства");
        //}


        // ИЛИ
        String first = "4?9";  // Просто назначил к переменным значения, а именна числа в которых есть вопросы. 
        String second = "34?"; // Просто назначил к переменным значения, а именна числа в которых есть вопросы.
        String third = "?7?";  // Просто назначил к переменным значения, а именна числа в которых есть вопросы.
        ArrayList<String> firstlist = digitList(first);  // К каждой переменной использовали фугкцию digitList().
        ArrayList<String> secondlist = digitList(second);// К каждой переменной использовали фугкцию digitList().
        ArrayList<String> thirdlist = digitList(third);  // К каждой переменной использовали фугкцию digitList().
        System.out.println(checkResult(firstlist, secondlist, thirdlist));

    }

    private static String checkResult(ArrayList<String> first, ArrayList<String> second, ArrayList<String> third) {
        for(String s: first)
            {
                for(String value : third)
                    {
                        for (String item : third)
                            {
                                if(Integer.parseInt(s) + Integer.parseInt(value) == Integer.parseInt(item))
                                    {
                                        var s1 = s + " + " + value + " = " + item;
                                        return s1;
                                    }
                            }
                    }
            }
        return "Решений нет";
    }

    private static ArrayList<String> digitList(String digit) {
        
        StringBuilder number = new StringBuilder(); // Создали Builder строку.
        ArrayList<String> numberList = new ArrayList<>();
        if(!digit.contains("?")) // Если в строк нет знака ?, то добавляем строку в numberList.
            {
                numberList.add(digit); // Добавляем строку в numberList.
                return numberList; // Возвращаем numberList.
            }
        for(int i = 0; i < digit.length(); i++) // Иначе запускается цикл на поиск знака ?.
            {
                if(digit.charAt(i) == '?') // Если элемент строки равен ?, проваливаемся в цикл.
                    {
                        for(int j = 0; j < 10; j++) // Складываем в numberList суммы какие то.
                            {
                                numberList.add(digit.substring(0, i) + j + digit.substring(i+1, digit.length()));
                            }
                            break;
                    }
            }


        for (int i = 0; i < numberList.size(); i++)
            {
                if(numberList.get(i).contains("?"))
                    {
                        numberList.addAll(digitList(numberList.get(i)));
                    }
            }

        for(int i = 0; i < numberList.size(); i++)
            {
                if(numberList.get(i).contains("?"))
                    {
                        numberList.remove(i);
                        i+= 1;
                    }
            }
        return numberList;
    }

    public static void name() {
        
    }
}
