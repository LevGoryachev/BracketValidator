package ru.goryachev.bracketvalidator;

import java.util.Scanner;

public class InputForm {

    public String getCheckingString () {
        System.out.println("Введите текст для проверки:");
        Scanner console = new Scanner(System.in);
        return console.nextLine();
    }
}
