package ru.goryachev.bracketvalidator;

import javax.swing.*;

public class MessageInformer implements Informer {

    Validator validator;

    public MessageInformer(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void showMessage() {

        boolean result = validator.validate();

        if (result) {
            JOptionPane.showMessageDialog(null, "Ok. Everything is ok!");
        } else {
            JOptionPane.showMessageDialog(null, "The brackets are placed incorrectly!!!");
        }
    }
}
