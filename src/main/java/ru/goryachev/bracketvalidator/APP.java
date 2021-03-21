package ru.goryachev.bracketvalidator;

public class APP {

    public static void main(String[] args) {

        InputForm inputForm = new ConsoleInput();
        Validator validator = new BracketValidator(inputForm);
        new TextInformer(validator).showMessage();
        //new MessageInformer(validator).showMessage();
    }
}
