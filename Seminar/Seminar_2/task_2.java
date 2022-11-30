package Java_L_S_D.Seminar.Seminar_2;
// Необходимо вернуть истину или ложь, при условии является ли строка полиндромом.
public class task_2 {
    public static void main(String[] args) {
        String w = "sdfsdf";
        if(polindrom(w))
            {
                System.out.printf("слово %s - полиндром", w);
            }
        else
            {
                System.out.printf("слово %s - не полиндром", w);
            }
    }
    public static boolean polindrom(String word) {
        String str = word;
        String[] array = str.split("");
        for (int i = 0; i < array.length / 2; i++) 
            {
                String temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
                System.out.println(i);
            }
        
        str = String.join("", array);
        
        if(str.equals(word))
            {
                return true;
            }
        return false; 
        }
    // Или так:
    // public static void name(String[] args) {
    //     String chars = "00c0c00";
    //     int count = 0;
    //     for (int i = 0; i < chars.length() / 2; i++)
    //         {
    //             if(chars.charAt(i) == chars.charAt(chars.length() - i - 1))
    //                 {
    //                     count++;
    //                 }
    //         }
    //     
    //     System.out.println(chars);
    //     if(count >= (chars.length() / 2))
    //         {
    //             System.out.println("полиндром");
    //         }
    //     else
    //         {
    //             System.out.println("не полиндром");
    //         }
    // }
}
