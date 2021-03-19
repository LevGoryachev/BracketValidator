package ru.goryachev.bracketvalidator;

import java.util.*;

public class BracketValidator {

    private String checkingString;

    public BracketValidator(String checkingString) {
        this.checkingString = checkingString;
    }

    public boolean validate () {

        //also workable:
        //Stack<Character> stack = new Stack<>();
        //PriorityQueue<Character> queue = new PriorityQueue<>();

        LinkedList<Character> linkedList = new LinkedList<>();

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
