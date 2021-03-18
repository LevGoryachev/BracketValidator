package ru.goryachev.bracketvalidator;

public class Informer {

    private boolean result;

    public Informer(boolean result) {
        this.result = result;
    }

    public void printMessage() {

        if (this.result) {
            System.out.println("Ok. Всё в порядке!");
        } else {
            System.out.println("Скобки расставлены НЕправильно!!!");
        }
    }
}
