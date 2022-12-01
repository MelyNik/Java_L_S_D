package Java_L_S_D.Seminar.Seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class task_4 {
    public static void main(String[] args) {
        String path = "C:\\Новая папка\\Lesson\\Java_L_S_D\\Seminar\\Seminar_2\\";
        print(getFolder(path));
        writeFolder(getFolder(path));
    }
    public static ArrayList<String> getFolder (String path) {
        ArrayList<String> array = new ArrayList<>();
        try 
            {
                File fl = new File(path);
                FileWriter log = new FileWriter(fl);
                for (File file : fl.listFiles()) // Проходим по всем файлам папки Seminar_2.
                    {
                        array.add(file.getName()); // В array записываем именно имена файлов,  getName() возвращает название файла.
                    }
                return array;
            } 
        catch (Exception e)
            {
                logger("Ошибка работы с фалом.");
                System.out.println("Ошибка работы с фалом.");
                array.add("Ошибка");
                return array;
                // TODO: handle exception
            }       
    }
    public static void print(ArrayList<String> array) {
        for (String i : array) 
            {
                System.out.println(i);
            }
    }
    public static void writeFolder(ArrayList<String> array) {
        try 
            {
                FileWriter fw  = new FileWriter("C:\\Новая папка\\Lesson\\Java_L_S_D\\Seminar\\Seminar_2\\content.txt", true);
                for (String f : array) 
                    {
                        fw.write(f);
                        fw.append("\n");
                    }
                fw.flush();
            } 
        catch (Exception e)
            {
                logger("Ошибка работы с фалом.");
                System.out.println("Ошибка работы с фалом.");
                // TODO: handle exception
            }  
    }
    public static void logger(String text) {
        try 
            {
                FileWriter log = new FileWriter("C:\\Новая папка\\Lesson\\Java_L_S_D\\Seminar\\Seminar_2\\log.txt", true);
                log.write(LocalDateTime.now() + " " + text);
                log.flush();
            } 
        catch (Exception ex) 
            {
                System.out.println(ex);
                // TODO: handle exception
            }
    }
}
