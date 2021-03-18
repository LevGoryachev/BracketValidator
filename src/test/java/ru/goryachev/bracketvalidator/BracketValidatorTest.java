package ru.goryachev.bracketvalidator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BracketValidatorTest {

    @ParameterizedTest
    //Lev Goryachev: set first parameter correct, second parameter incorrect
    @CsvSource({"'abc(def)gh', 'abcdef)gh'", "'xyz{l}bc', 'xyz{lb[]c'", "'abc[def]gh', 'abc[de}fgh'", "'abc(d[]ef)g{}h', 'abc(defg])h'", "'x[yz{l()}b]c', 'x{y{z}lb()c'"})
    public void checkBrackets(String correct, String incorrect) {
        BracketValidator correctValidator = new BracketValidator(correct);
        boolean corResult = correctValidator.validate();
        assertTrue(corResult);

        BracketValidator incorrectValidator = new BracketValidator(incorrect);
        boolean incorResult = incorrectValidator.validate();
        assertFalse(incorResult);
    }
}