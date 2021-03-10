package ru.goryachev.bracketvalidator;

public class APP {

    public static void main(String[] args) {

        InputForm inputForm = new InputForm();
        BracketValidator bracketValidator = new BracketValidator(inputForm.getCheckingString());
        bracketValidator.checkBrackets();
    }
}
