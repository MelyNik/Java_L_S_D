package Java_L_S_D.DZ.DZ_2;
// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Dz_1 {
    public static void main (String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.printf("Введите длину массива: ");
        int number = check();
        while (number < 0) {
            number = check();
        }


        int[] array = createArray(number);
        print(array);
        System.out.println();

        array = sorting(array);
        print(array);
        System.out.println();
    }

    public static int check() {
        Scanner number = new Scanner(System.in);
        int[] array = {0};
        boolean flag = number.hasNextInt();
		if (flag == true) {
            int n = number.nextInt();
            return n;
		}
        else{
            System.out.printf ("Ошибка ввода! Введите повторно: \n");
            logger(array,"Ошибка ввода! Введите повторно: \n");
            return -1;
		}
    }

    public static int[] createArray (int number) {
        Random ran = new Random();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(1, 1000);
        }
        return array;
    }

    public static void print(int[] my_array) {
        for (int i = 0; i < my_array.length; i++) {
            System.out.printf("%d ", my_array[i]);
        }
    }

    public static int[] sorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                logger(array,"");
            }
        }
        return array;
    }

    public static void logger(int[] array, String text) {
        StringBuilder buil = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            buil.append(array[i]);
            buil.append(" ");
        }
        try {
            FileWriter log = new FileWriter("C:\\Новая папка\\Lesson\\Java_L_S_D\\DZ\\DZ_2\\log.txt", true);
            if(text.equals(""))
                {
                    log.write(LocalDateTime.now() + " " + buil + "\n");
                }
            else
                {
                    log.write(LocalDateTime.now() + " " + buil + "\n");
                    log.write(LocalDateTime.now() + " " + text);
                }
            log.flush();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
