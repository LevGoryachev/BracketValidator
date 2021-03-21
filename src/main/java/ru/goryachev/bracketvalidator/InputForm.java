package ru.goryachev.bracketvalidator;

import java.util.Scanner;

public class InputForm {

    String checkingString = null;

    public String getCheckingString () {
        System.out.println("Введите текст для проверки:");
        Scanner console = new Scanner(System.in);
        this.checkingString = console.nextLine();
        while (checkingString == null || checkingString.equals("") || checkingString.equals(" ")) {
            System.out.println("Текст для проверки отсутствует. Попробуйте ещё раз.");
            this.checkingString = console.nextLine();
        }
        return checkingString;
    }
}
