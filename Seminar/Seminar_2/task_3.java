package Java_L_S_D.Seminar.Seminar_2;

import java.io.FileWriter;
import java.io.IOException;
// Создать файл и записать в него TEST 100 раз.
public class task_3 {
    public static void main(String[] args) {
        try 
            {
                FileWriter fw = new FileWriter("C:/Новая папка/Lesson/Java_L_S_D/Seminar/Seminar_2/file.txt", true);
                String txt = "TEST ";
                StringBuilder bild = new StringBuilder();
                for(int i = 0; i < 100; i++)
                    {
                        bild.append(txt);
                    }
                fw.write(String.valueOf(bild));
                fw.flush();
            } 
        catch (IOException ex) 
            {
                System.out.println(ex);
                // TODO: handle exception
            }
    }
}
