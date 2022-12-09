package Java_L_S_D.Seminar.Seminar_5;

import java.util.HashMap;
import java.util.Map;

// Даны 2 строки, написать метод, который вернёт true, если эти строки являются изоморфными
// и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить
// на некоторую букву во втором слове, приэтом
//      Повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением погсрядка
//      следования. (Например, add - egg изоморфны)

//      Буква может не менятся, а оставться такой же. (Например, note - code)

// Пример 1:
// inputs: s = "foo", t = "bar"
// Output: false

// Пример 2:
// inputs: s = "paper", t = "title"
// Output: true

public class task_2 {
    public static void main(String[] args) {
        
    }
    public static boolean izomorph(String s1, String s2) {
        if(s1.length() != s2.length())
            {
                return false;
            }
        if(s1.equals(s2))
            {
                return true;
            }
        Map<Character, String> list = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if(list.containsKey(list))
        }
    }
}
