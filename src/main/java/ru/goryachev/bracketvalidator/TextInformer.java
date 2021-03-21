package ru.goryachev.bracketvalidator;

public class TextInformer implements Informer {

    private Validator validator;

    public TextInformer(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void showMessage() {

        boolean result = validator.validate();

        if (result) {
            System.out.println("Ok. Всё в порядке!");
        } else {
            System.out.println("Скобки расставлены НЕправильно!!!");
        }
    }
}
