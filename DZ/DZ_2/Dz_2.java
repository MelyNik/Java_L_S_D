package Java_L_S_D.DZ.DZ_2;
import java.io.IOException;
// К калькулятору из предыдущего дз добавить логирование.
import java.util.Scanner;
import java.util.logging.*;
public class Dz_2 {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger log = Logger.getLogger(Dz_2.class.getName());
        FileHandler fh = new FileHandler("C:\\Новая папка\\Lesson\\Java_L_S_D\\DZ\\DZ_2\\log_2.txt");
        log.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        
        System.out.printf("Добро пожаловать в калькулятор! \n");
        System.out.printf("Введите первое число: \n");
        float number_1 = check();
        while(number_1 < 0)
            {
                number_1 = check();
            }
        log.info(Float.toString(number_1));

        System.out.printf("Введите второе число: \n");
        float number_2 = check();
        while(number_2 < 0)
            {
                number_2 = check();
            }
        log.info(Float.toString(number_2));

        System.out.println("Введите один из наков операции (+, -, /, //, %, *, **):");
        String symbol = Symbol();
        while(symbol == "!")
            {
                symbol = Symbol();
            }
        log.info(symbol);

        float result = 0;
        if(symbol.equals("+"))
            {
                result = number_1 + number_2;
            }
        else if(symbol.equals("-"))
            {
                result = number_1 - number_2;
            }
        else if(symbol.equals("/"))
            {
                result = number_1 / number_2;
            }
        else if(symbol.equals("//"))
            {
                int num_1 = (int)number_1;
                int num_2 = (int)number_2;
                result = num_1 / num_2;
            }
        else if(symbol.equals("%"))
            {
                result = number_1 % number_2;
            }
        else if(symbol.equals("*"))
            {
                result = number_1 * number_2;
            }
        else if(symbol.equals("**"))
            {
                double num_1 = (double)number_1;
                double num_2 = (double)number_2;
                result = (float)Math.pow(num_1, num_2);
            } 
        System.out.printf("%.2f %s %.2f = %.2f\n", number_1, symbol, number_2, result);
        log.info(Float.toString(number_1) + " " + symbol + " " + Float.toString(number_2) + " " + "=" + " " + Float.toString(result));

    }
    static float check () {
        Scanner number = new Scanner(System.in);
        boolean flag = number.hasNextFloat();
		if (flag == true) {
            float N = number.nextFloat();
            return N;
		}
        else{
            System.out.printf ("Ошибка ввода! Введите повторно: \n");
            return -1;
		}
    }
    static String Symbol () {
        Scanner number = new Scanner(System.in);
        String text = number.nextLine();
        if (text.equals("+") || text.equals("-") || text.equals("/") || text.equals("//") || text.equals("%") || text.equals("*") || text.equals("**")) 
            {
                return text;
		    }
        else
            {
            System.out.printf ("Ошибка ввода! Введите повторно: \n");
            return "!";
		    }
    }
}