package Java_L_S_D.Lectures.Lesson_2;
import java.io.File;
import java.io.IOException;
import java.util.logging.*;
public class task_1 {
    public static void main(String[] args) throws SecurityException, IOException {
        // String или StringBuilder

        // Функции работ со строками:
        // concat() - Объеденение строк.
        // valueOf() - Преобразует Объект в строкове представление (завязан на toString())
        // join() - Объеденяет набор строк в одну с учётом разделителя. 
        // charAt() - Получения символа по индексу. 
        // indexOf() - Первый индекс вхождения подстроки. 
        // lastIndexOf() - Последний индекс вхождения подстроки. 
        // startsWith() - Определяет, начинается ли строка с подстроки. 
        // endsWith() - Определяет, заканчивается ли строка с подстроки.
        // replace() - ЗАмена одной подстроки на другую.
        String[] name = { "С", "т", "о", "л" };
        String sk = "CТОЛ.";
        System.out.println(sk.toLowerCase()); // Вывод "стол" - т.е. перевили всё в нижний регистр.
        System.out.println(String.join("", name)); // Вывод "Стол", как я понял объеденили все элементы массива.
        System.out.println(String.join("", "С", "т", "о", "л")); // Вывод "С, т, о, л"
        System.out.println(String.join(",", "С", "т", "о", "л"));

        try 
            {
                String file = System.getProperty("user.dir"); // Таким образом указываем путь у папки.
                String pathFile = file.concat("/file.txt"); // Указываем конкретный файл.
                File f1 = new File(pathFile); // Связываем переменную f1 с файлом pathFile.
                System.out.println("Успешно"); // Если все функции на разных платформах выполены верно
                                                 // то выводим сообщение "Успешно"
                // System.out.println(f1.getAbsolutePath());
                // /User/sk/vscode/java_projects/file.txt
                // C:/Users/sk/Documents/xxx/brainexplosion/java/file.txt
            } 
        catch (Exception e) 
            {
                System.out.println("Ошибка, нужно сделать то то"); // Если как вариант путь к файлу указан
                                                                     // не верно или файла не существует
                                                                     // выводим сообщение 
                                                                     // "Ошибка, нужно сделать то то".
                // TODO: handle exception
            }
        finally
            {
                System.out.println("Финал"); // Будет выводится всегда не зависимо от того какой блок ранее 
                                               // будет работать, думаю, что это означает завершение работы
                                               // программы выводом сообщения "Финал".
            }


        // Работа с файловой системой.
        // isHidden() - Возвращает истину, если каталог или файл является скрытым. 
        // length() - Возвращает размер файла в байтах.
        // lastModified() - Возвращает время последнего изменения файла или каталог. 
        // list() - Возвращает массив файлов и подкатологов, которые находятся в каталоге. 
        // listFiles() - Возвращает массив файлов и подкатологов, которые находятся в определённом каталоге.
        // mkdir() - Создаёт новый каталог. 
        // renameTo(File dest) - Переименовывает файл или каталог.




        // Логирование.
        Logger logger = Logger.getLogger(task_1.class.getName()); // В скобках нужно указать тип (имя) класса для котрого планируем использовать.
        //  Уровни важности INFO, DEBUG, ERROR, WARNING и др.
        ConsoleHandler ch = new ConsoleHandler(); // Куда сохранять. А ConsoleHandler означает, что все ошибки
                                                  // будут выведены в терминал.
        FileHandler fh = new FileHandler("log.xml"); // Для создания файла логирования и добавления туда информации.
        logger.addHandler(ch); // И передаём ch в качестве аргумента для нашего логера.
        // Формат выводаЖ: XMLFormatter, SimpleFormatter
        XMLFormatter xml = new XMLFormatter(); // Создали формат.
        // SimpleFormatter sf = new SimpleFormatter(); - Формат меняется очень проста.
        ch.setFormatter(xml);

        logger.log(Level.WARNING, "Тестовое логирование 1"); // Указываем уровень контроля, в данном случае WARNING.
        logger.info("Тестовое логирование 2"); // Обычно использует эту строку вместо строки выше.
    }
}
