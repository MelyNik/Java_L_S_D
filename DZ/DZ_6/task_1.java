package Java_L_S_D.DZ.DZ_6;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую 
// необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Set<Notebook_task_1> line = new HashSet<>();
        Random rnd = new Random();

        Notebook_task_1 Notebook_1 = new Notebook_task_1(colour(rnd.nextInt(0, 4)));
        Notebook_1.setRam(ram(rnd.nextInt(0, 5)));
        Notebook_1.setHardDiskCapacity(hardDiskCapacity(rnd.nextInt(0, 4)));
        Notebook_1.setOperatingSystem(operatingSystem(rnd.nextInt(0, 4)));
        line.add(Notebook_1);

        Notebook_task_1 Notebook_2 = new Notebook_task_1(colour(rnd.nextInt(0, 4)));
        Notebook_2.setRam(ram(rnd.nextInt(0, 5)));
        Notebook_2.setHardDiskCapacity(hardDiskCapacity(rnd.nextInt(0, 4)));
        Notebook_2.setOperatingSystem(operatingSystem(rnd.nextInt(0, 4)));
        line.add(Notebook_2);

        Notebook_task_1 Notebook_3 = new Notebook_task_1(colour(rnd.nextInt(0, 4)));
        Notebook_3.setRam(ram(rnd.nextInt(0, 5)));
        Notebook_3.setHardDiskCapacity(hardDiskCapacity(rnd.nextInt(0, 4)));
        Notebook_3.setOperatingSystem(operatingSystem(rnd.nextInt(0, 4)));
        line.add(Notebook_3);

        Notebook_task_1 Notebook_4 = new Notebook_task_1(colour(rnd.nextInt(0, 4)));
        Notebook_4.setRam(ram(rnd.nextInt(0, 5)));
        Notebook_4.setHardDiskCapacity(hardDiskCapacity(rnd.nextInt(0, 4)));
        Notebook_4.setOperatingSystem(operatingSystem(rnd.nextInt(0, 4)));
        line.add(Notebook_4);

        Notebook_task_1 Notebook_5 = new Notebook_task_1(colour(rnd.nextInt(0, 4)));
        Notebook_5.setRam(ram(rnd.nextInt(0, 5)));
        Notebook_5.setHardDiskCapacity(hardDiskCapacity(rnd.nextInt(0, 4)));
        Notebook_5.setOperatingSystem(operatingSystem(rnd.nextInt(0, 4)));
        line.add(Notebook_5);

        Notebook_task_1 Notebook_6 = new Notebook_task_1(colour(rnd.nextInt(0, 4)));
        Notebook_6.setRam(ram(rnd.nextInt(0, 5)));
        Notebook_6.setHardDiskCapacity(hardDiskCapacity(rnd.nextInt(0, 4)));
        Notebook_6.setOperatingSystem(operatingSystem(rnd.nextInt(0, 4)));
        line.add(Notebook_6);

        for (Notebook_task_1 item : line) {
            System.out.println(item);
        }

        specifications(line);

    }

    public static int ram (int i) {
        int[] ram = new int[]{2, 4, 8, 16, 32};
        return ram[i];
    }
    public static int hardDiskCapacity (int i) {
        int[] hardDiskCapacity = new int[] {128, 256, 512, 1024};
        return hardDiskCapacity[i];
    }
    public static String operatingSystem (int i) {
        String[] operatingSystem = new String[] {"Windows", "Linux", "MacOs", "Ubuntu"};
        return operatingSystem[i];
    }
    public static String colour (int i) {
        String[] colour = new String[] {"red", "black", "gray", "white"};
        return colour[i];
    }
    public static void specifications(Set <Notebook_task_1> line) {
        System.out.println("Введите необходимые характеристики ноутбука:\n" + 
                            "1 - Размер ОЗУ\n" +
                            "2 - Объем ЖД\n" +
                            "3 - Операционная система\n" +
                            "4 - Цвет");
        Scanner sk = new Scanner(System.in);
        String inputUser = sk.nextLine();
        String[] array = inputUser.split(" ");
        ArrayList <String> arrayList_1 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) == 1) {
                System.out.println("Введите минимальное значение оперативной памяти в Гб: ");
                String ram = sk.nextLine();
                arrayList_1.add(ram);
            }
            if (Integer.parseInt(array[i]) == 2) {
                System.out.println("Введите минимальное значение объема ЖД в Гб: ");
                String hardDiskCapacity = sk.nextLine();
                arrayList_1.add(hardDiskCapacity);
            }
            if (Integer.parseInt(array[i]) == 3) {
                System.out.println("Выберите операционную систему:\n" +
                                        "1 - Windows\n" +
                                        "2 - Linux\n" +
                                        "3 - MacOs\n" +
                                        "4 - Ubuntu");
                String operatingSystem = sk.nextLine();
                arrayList_1.add(operatingSystem);
            }
            if (Integer.parseInt(array[i]) == 4) {
                System.out.println("Выберите желаемый цвет ноутбука:\n" +
                                        "1 - Красный\n" +
                                        "2 - Чёрный\n" +
                                        "3 - Серый\n" +
                                        "4 - Белый");
                String colour = sk.nextLine();
                arrayList_1.add(colour);
            }
        } 
        TreeMap<Integer, Integer> arrayList_2 = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            arrayList_2.put(Integer.parseInt(array[i]), Integer.parseInt(arrayList_1.get(i)));
        }
        System.out.println(arrayList_2);
        
        int operatingSystem_2 = 0;
        if (arrayList_2.get(3) != null) {
            operatingSystem_2 = arrayList_2.get(3);
        }

        int ram_2 = 0;
        if (arrayList_2.get(1) != null) {
            ram_2 = arrayList_2.get(1);
        }

        int hardDiskCapacity_2 = 0;
        if (arrayList_2.get(2) != null) {
            hardDiskCapacity_2 = arrayList_2.get(2);
        }
        
        Set <Notebook_task_1> line_2 = new HashSet<>();
        for (Notebook_task_1 item : line) {
            if (item.getRam() >= ram_2 && item.getHardDiskCapacity() >= hardDiskCapacity_2
            && (item.getOperatingSystem() == operatingSystem_2 || operatingSystem_2 == 0)) {
                line_2.add(item); 
            }
        }
        for (Notebook_task_1 item : line_2) {
            System.out.println(item);
        }
    }
}