package ru.goryachev.bracketvalidator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BracketValidatorTest {

    @Test
    public void checkBrackets() {
        BracketValidator bracketValidator = new BracketValidator("abc(def)gh");
        boolean result = bracketValidator.validate();
        assertTrue(result);
    }
}