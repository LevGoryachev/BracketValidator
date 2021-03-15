package ru.goryachev.bracketvalidator;

import java.util.Stack;

public class BracketValidator {

    private String checkingString;

    public BracketValidator(String checkingString) {
        this.checkingString = checkingString;
    }

    public boolean validate () {

        Stack<Character> stack = new Stack<>();

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
}
