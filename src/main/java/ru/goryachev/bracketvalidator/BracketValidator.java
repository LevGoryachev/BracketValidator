package ru.goryachev.bracketvalidator;

import java.util.*;

public class BracketValidator implements Validator {

    private  InputForm inputForm;

    public BracketValidator(InputForm inputForm) {
        this.inputForm = inputForm;
    }

    @Override
    public boolean validate () {

        String checkingString = inputForm.getCheckingString();
        while (checkingString == null || checkingString.equals("") || checkingString.equals(" ")) {
            System.out.println("Текст для проверки отсутствует. Попробуйте ещё раз.");
            checkingString = inputForm.getCheckingString();
        }

        LinkedList<Character> linkedList = new LinkedList<>();
        //also workable:
        //Stack<Character> stack = new Stack<>();
        //PriorityQueue<Character> queue = new PriorityQueue<>();

        for (int i = 0; i < checkingString.length(); i++) {
            char symbol = checkingString.charAt(i);
            if (symbol == '(' || symbol == '{' || symbol == '[')
                linkedList.push(symbol);
            else if (symbol == ']') {
                if (linkedList.isEmpty() || linkedList.pop() != '[')
                    return false;
            } else if (symbol == '}') {
                if (linkedList.isEmpty() || linkedList.pop() != '{')
                    return false;
            } else if (symbol == ')') {
                if (linkedList.isEmpty() || linkedList.pop() != '(')
                    return false;
            }
        }
        return linkedList.isEmpty();
    }
}
