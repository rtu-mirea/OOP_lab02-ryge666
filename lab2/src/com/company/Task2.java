package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    private String m = "Иванов И.И., ivanov@. Петров Д.С., petrov@gmail.com. Сидоров М.П., sidorov@gmail.com. Кузнецов А.Е., kuznecov@yandex.ru.";
    StringBuilder sb = new StringBuilder();
    private String sentence[] = m.split("[.] ");
    Scanner in = new Scanner(System.in);

    public Task2(){

    }

    public void consoleOut(){
        for (int i = 0; i < sentence.length; i++)
            System.out.print(sentence[i] + " ");
        System.out.print("\n");
    }

    public void add(){
        sentence = Arrays.copyOf(sentence, sentence.length+1);
        for(int i =0; i < sentence.length; i++){
            if(i == sentence.length-1){
                sentence[i] = "Рябов Г.М., ryabov@";
            }
        }
    }

    public void count (){
        sb = new StringBuilder(Arrays.deepToString(sentence));
        sb.insert(0, "Количество контактов: " + sentence.length + ". ");
        System.out.println(sb);
    }

    public void mistake(){
        boolean isTrue = true;
        for (int i = 0; i < sentence.length; i++){
            if (sentence[i].endsWith("@")){
                while (isTrue) {
                    System.out.print("Найдена ошибка в заполнении! <" + sentence[i] + "> Введите корректно Фамилию И.О., адрес электронной почты.: ");
                    sentence[i] = in.nextLine();
                    if (sentence[i].endsWith("."))
                        isTrue = false;
                }
                isTrue = true;
            }
        }
    }
}