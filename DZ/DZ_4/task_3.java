package Java_L_S_D.DZ.DZ_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Написать программу, определяющую правильность расстановки скобок в выражении.
// a+(d*3) - истина
// [a+(1*3) - ложь
// [6+(3*3)] - истина
// {a}[+]{(d*3)} - истина
// <{a}+{(d*3)}> - истина
// {a+]}{(d*3)} - ложь

public class task_3 {
    public static void main(String[] args) {

        System.out.println("Выбирите номер желаемого уравнения для проверки:\n1 - a+(d*3)\n2 - [a+(1*3)\n3 - [6+(3*3)]\n4 - {a}[+]{(d*3)}\n5 - <{a}+{(d*3)}>\n6 - {a+]}{(d*3)}");

        int number = check();
        while(number < 0 || number > 6)
            {
                number = check();
            }
        
        String str_1 = "a+(d*3)";
        String str_2 = "[a+(1*3)";
        String str_3 = "[6+(3*3)]";
        String str_4 = "{a}[+]{(d*3)}";
        String str_5 = "<{a}+{(d*3)}>";
        String str_6 = "{a+]}{(d*3)}";

        if(number == 1)
            {   
                String[] array = str_1.split("");
                ArrayList <String> list = new ArrayList<>(Arrays.asList(array));
                System.out.println(list); 

                Remove(list, "(", ")");
                Remove(list, "[", "]");
                Remove(list, "{", "}");
                Remove(list, "<", ">");
        
                System.out.println(list);
        
                System.out.println(CheckBracket(list));
            }
        else if(number == 2)
            {
                String[] array = str_2.split("");
                ArrayList <String> list = new ArrayList<>(Arrays.asList(array));
                System.out.println(list); 

                Remove(list, "(", ")");
                Remove(list, "[", "]");
                Remove(list, "{", "}");
                Remove(list, "<", ">");
        
                System.out.println(list);
        
                System.out.println(CheckBracket(list));
            }
        else if(number == 3)
            {
                String[] array = str_3.split("");
                ArrayList <String> list = new ArrayList<>(Arrays.asList(array));
                System.out.println(list); 

                Remove(list, "(", ")");
                Remove(list, "[", "]");
                Remove(list, "{", "}");
                Remove(list, "<", ">");
        
                System.out.println(list);
        
                System.out.println(CheckBracket(list));
            }
        else if(number == 4)
            {
                String[] array = str_4.split("");
                ArrayList <String> list = new ArrayList<>(Arrays.asList(array));
                System.out.println(list); 

                Remove(list, "(", ")");
                Remove(list, "[", "]");
                Remove(list, "{", "}");
                Remove(list, "<", ">");
        
                System.out.println(list);
        
                System.out.println(CheckBracket(list));
            }
        else if(number == 5)
            {
                String[] array = str_5.split("");
                ArrayList <String> list = new ArrayList<>(Arrays.asList(array));
                System.out.println(list); 

                Remove(list, "(", ")");
                Remove(list, "[", "]");
                Remove(list, "{", "}");
                Remove(list, "<", ">");
        
                System.out.println(list);
        
                System.out.println(CheckBracket(list));
            }
        else
            {
                String[] array = str_6.split("");
                ArrayList <String> list = new ArrayList<>(Arrays.asList(array));
                System.out.println(list);

                Remove(list, "(", ")");
                Remove(list, "[", "]");
                Remove(list, "{", "}");
                Remove(list, "<", ">");
        
                System.out.println(list);
        
                System.out.println(CheckBracket(list));
            }
    }

    static int check() {
        Scanner sk = new Scanner(System.in);
        String str = sk.nextLine();

        try {
            int i = Integer.parseInt(str.trim());
            if(i > 6)
                {
                    System.out.println("Ошибка! Повторите ввод.");
                }
            return i;
        } catch (Exception e) {
            System.out.println("Ошибка! Повторите ввод.");
            return -1;
        }
    }

    public static ArrayList <String> Remove(ArrayList<String> array, String Bracket_1, String Bracket_2) {
        for (int i = 0; i < array.size(); i++) {
            
            if (array.get(i).equals(Bracket_1)) {
                
                for (int j = 0; j < array.size(); j++) {
                    
                    if (array.get(j).equals(Bracket_2)) {
                        array.remove(j);
                        array.remove(i);
                        break; 
                    }
                }
            }
        }

        return array;
    }

    public static boolean CheckBracket (ArrayList<String> array) {
        boolean list = true;

        for (int i = 0; i < array.size(); i++) {
            
            if (array.get(i).equals("(") || array.get(i).equals(")") || array.get(i).equals("[") || array.get(i).equals("]") || array.get(i).equals("{") || array.get(i).equals("}") || array.get(i).equals("<") || array.get(i).equals(">")) {
                list = false;
            }
        }

        return list;
    }
}
