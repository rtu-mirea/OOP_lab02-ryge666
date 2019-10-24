package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public Task3(){}

    public void getPrice()
    {
        String input = "I got a wristwatch for $50000 and i could sell it to a Nigerian for \" +\n" +
                "            \"?1300,00000 or to someone in Saudi Arabia for ?800000 or Afghanistan for ?350";

        Pattern pattern = Pattern.compile("\\d+[,\\.]?(\\d+)?");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find())
        {
            System.out.println(matcher.group());
        }
    }
}