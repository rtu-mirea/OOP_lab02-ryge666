package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.String;
import java.util.Scanner;

public class Task1 {
    private String str, n[], m[][], x[];
   // private ArrayList<String> list = new ArrayList<>();
    private int a;
    static int count = 0;
    Scanner in = new Scanner(System.in);

    public Task1() {

    }

    public void ConsoleInPut() {
        str = "Рябов Г.М., ryabov@mail.ru. Сидоров Д.Л., sidorov@yandex.com. Смирнов С.С., smirnov@gmail.com.";
    }

    public void consoleOut() {
        String forCom [] = str.split("\\s");
        this.a = forCom.length;
        String sentence[] = str.split("\\. ");
        String words[][] = new String[sentence.length][];
        for (int i = 0; i < sentence.length; ++i) {
            words[i] = sentence[i].split("[,]\\s");
        }
        System.out.println(Arrays.deepToString(words));
        this.n = sentence;
        this.m = words;
        this.x = forCom;
    }

    public void uppercase() {
        for (int i = 0; i < n.length; i++) {
            m[i][0] = m[i][0].toUpperCase();
        }
        System.out.println(Arrays.deepToString(m));
    }


    public void surnameArr(ArrayList s){
        char inn = in.next().charAt(0);
        inn = Character.toUpperCase(inn);
        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < 1; j++){
                char a_char = m[i][j].charAt(0);
                if (inn == a_char){
                    s.add(m[i][j]);
                }
            }
        }
    }

    public void comCount(){
        for(int i = 0; i < a; i++) {
            if (x[i].endsWith("com."))
                count++;
        }
    }

    public void contactStr(ArrayList p){
        String w = in.nextLine();
        for (int i = 0; i < n.length; i++) {
            int pos = m[i][1].indexOf("@") + 1;
            boolean isYandex = m[i][1].startsWith("yandex", pos);
            boolean isGmail = m[i][1].startsWith("gmail", pos);
            boolean isMail = m[i][1].startsWith("mail", pos);

            if (w.equals("yandex") && isYandex == true) {
                p.add(m[i][1]);
            }

            if (w.equals("gmail") && isGmail == true) {
                p.add(m[i][1]);
            }

            if (w.equals("mail") && isMail == true) {
                p.add(m[i][1]);
            }
        }
    }
}


