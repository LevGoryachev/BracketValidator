package ru.goryachev.bracketvalidator;

import java.util.Scanner;

public class ConsoleInput implements InputForm {

    Scanner console = new Scanner(System.in);

    @Override
    public String getCheckingString () {
        System.out.println("Введите текст для проверки:");
        return console.nextLine();
    }
}
