package ru.goryachev.bracketvalidator;

import java.util.Stack;

public class BracketValidator {

    private String checkingString;

    public BracketValidator(String checkingString) {
        this.checkingString = checkingString;
    }

    private boolean validate () {

        boolean result;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < checkingString.length(); i++) {
            char symbol = checkingString.charAt(i);
            if (symbol == '(' || symbol == '{' || symbol == '[')
                stack.push(symbol);
            else if (symbol == ']') {
                if (stack.empty() || stack.pop() != '[')
                    return false;
            } else if (symbol == '}') {
                if (stack.empty() || stack.pop() != '{')
                    return false;
            } else if (symbol == ')') {
                if (stack.empty() || stack.pop() != '(')
                    return false;
            }
        }
        return stack.empty();
    }

    public void checkBrackets (){

        if (this.validate()) {
            System.out.println("Ok. Всё в порядке!");
        } else {
            System.out.println("Скобки расставлены НЕправильно!!!");
        }
    }
}
