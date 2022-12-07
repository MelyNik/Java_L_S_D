package Java_L_S_D.DZ.DZ_4;

import java.util.ArrayList;
import java.util.Arrays;

// Написать программу, определяющую правильность расстановки скобок в выражении.
// a+(d*3) - истина
// [a+(1*3) - ложь
// [6+(3*3)] - истина
// {a}[+]{(d*3)} - истина
// <{a}+{(d*3)}> - истина
// {a+]}{(d*3)} - ложь

public class task_3 {
    public static void main(String[] args) {
        String str_1 = "a+(d*3)";
        String str_2 = "[a+(1*3)";
        String str_3 = "[6+(3*3)]";
        String str_4 = "{a}[+]{(d*3)}";
        String str_5 = "<{a}+{(d*3)}>";
        String str_6 = "{a+]}{(d*3)}";
        String[] s = str.split("");
        // парсим строку посимвольно и заносим в arraylist
        ArrayList <String> arrayList = new ArrayList<>(Arrays.asList(s));
        System.out.println(arrayList); // показываем начальный лист
        // удаляем парные скобки из листа
        RemoveBrackets(arrayList, "(", ")");
        RemoveBrackets(arrayList, "[", "]");
        RemoveBrackets(arrayList, "{", "}");
        RemoveBrackets(arrayList, "<", ">");
        // выводим очищенный лист
        System.out.println(arrayList);
        // выводим конечный результат проверки выражения
        System.out.println(Checking(arrayList));
    }

    // метод удаления парных скобок
    public static ArrayList <String> RemoveBrackets (ArrayList <String> arrayList, String fBracket, String sBracket) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(fBracket)) {
                for (int j = 0; j < arrayList.size(); j++) {
                    if (arrayList.get(j).equals(sBracket)) {
                        arrayList.remove(j);
                        arrayList.remove(i);
                        break; // скидываем цикл, если произошло удаление, чтобы не удалить лишние скобки
                    }
                }
            }
        }
        return arrayList;
    }

    // метод проверки на оставшиеся скобки
    public static boolean Checking (ArrayList <String> arrayList) {
        boolean result = true;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals("(") || arrayList.get(i).equals(")") || arrayList.get(i).equals("[") || arrayList.get(i).equals("]") || arrayList.get(i).equals("{") || arrayList.get(i).equals("}") || arrayList.get(i).equals("<") || arrayList.get(i).equals(">")) {
                result = false;
            }
        }
        return result;
    }
}
