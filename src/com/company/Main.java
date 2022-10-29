package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    // actually exercise 2
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int counter = 0;

        while (!scanner.hasNext("!") || counter < 1)
        {
            String word = scanner.next();
            if (word.equals("!"))
                counter++;

            // stage 1
            else if (!word.equals("!") && counter == 0)
                list.add(word);

            // stage 2
            if (counter == 1)
                if (list.contains(word))
                    System.out.println(word + " in index " + list.indexOf(word));
        }

    }
}
