package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("1. Задание 1: Применение класса String\n" +
                    "2. Задание 2: Применение класса StringBuilder\n" +
                    "3. Задание 3: Регулярные выражения\n" +
                    "0. Выход из программы");
            System.out.print("Введите номер задания: ");
            num = in.nextInt();
            switch (num) {
                case 1:
                    char inn;//Буква для поиска фамилий
                    ArrayList<String> surname = new ArrayList<String>();//Для массива фамилий по букве
                    ArrayList<String> post = new ArrayList<String>();

                    Task1 first = new Task1();

                    //Ввод через консоль
                    first.ConsoleInPut();

                    //Вывод в консоль
                    first.consoleOut();

                    //Изменение букв на прописные
                    System.out.println();
                    System.out.println("Фамилия И.О. прописными буквами:");
                    first.uppercase();

                    //Строка по заданному поставщику
                    System.out.print("\nВведите поставщика (yandex, mail, gmail): ");
                    first.contactStr(post);
                    System.out.println(post);

                    //Сколько контактов относится к домену com
                    first.comCount();
                    System.out.print("\nКоличество контактов относящихся к домену com: ");
                    System.out.println(Task1.count);
                    Task1.count = 0;

                    //Массив фамилий по заданной первой букве
                    System.out.println();
                    System.out.print("Введите первую букву фамилии: ");
                    first.surnameArr(surname);
                    System.out.println(surname);
                    break;
                case 2:
                    Task2 second = new Task2();
                    second.add();
                    second.consoleOut();
                    second.mistake();
                    second.consoleOut();
                    second.count();
                    break;
                case 3:
                    Task3 third = new Task3();
                    third.getPrice();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Выберите задание из вариантов представленных ниже");
            }
        }
    }
}




